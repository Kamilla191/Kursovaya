package com.travelpayouts.travel.app.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
public class DatabaseManager {
    private DatabaseHelper dbHelper;

    public DatabaseManager(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void addAirlineRecord(int airl_id, String airlineName, int iataCode, int icaoCode) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("airline_name", airlineName);
        values.put("airline_iata_code", iataCode);
        values.put("airlane_icao_code", icaoCode);
        db.insert("Airline", null, values);
        db.close();
    }

    public void addAirportRecord(int airportName, String airportAddress, String iataCode, int icaoCode, int latitudeLongitude) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("airport_name", airportName);
        values.put("airport_address", airportAddress);
        values.put("airport_iata_code", iataCode);
        values.put("airport_icao_code", icaoCode);
        values.put("airport_latitude_longitude", latitudeLongitude);
        db.insert("Airport", null, values);
        db.close();
    }

    public void addPassengerRecord(String firstName, String lastName, int details, int flightId) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("passanger_first_name", firstName);
        values.put("passanger_last_name", lastName);
        values.put("passanger_details", details);
        values.put("passanger_flight_id", flightId);
        db.insert("Passenger", null, values);
        db.close();
    }

    public void addBaggageRecord(int passengerId, int weight, int dimensions) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("passanger_id", passengerId);
        values.put("baggage_weight", weight);
        values.put("baggage_dimensions", dimensions);
        db.insert("Baggage", null, values);
        db.close();
    }

    public void addFlightRecord(int flightNumber, String departureDateTime, String arrivalDateTime, int departureAirportId, int arrivalAirportId, int airlineId, int destinationId, String departureTime, String arrivalTime) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("flight_number", flightNumber);
        values.put("flight_departure_date_time", departureDateTime);
        values.put("flight_arival_date_time", arrivalDateTime);
        values.put("flight_departure_airport_id", departureAirportId);
        values.put("flight_arival_airport_id", arrivalAirportId);
        values.put("flight_airline_id", airlineId);
        values.put("flight_destinantion_id", destinationId);
        values.put("flight_departure_time", departureTime);
        values.put("flight_arival_time", arrivalTime);
        db.insert("Flight", null, values);
        db.close();
    }

    public void addCheckPointRecord(String checkPointName, int terminalId) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("check_point_name", checkPointName);
        values.put("check_point_terminal_id", terminalId);
        db.insert("CheckPoint", null, values);
        db.close();
    }

    public void addTerminalRecord(String terminalName, int airportId) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("terminal_name", terminalName);
        values.put("terminal_airport_id", airportId);
        db.insert("Terminal", null, values);
        db.close();
    }

    public void addDestinationRecord(String destinationName, int iataCode, int icaoCode) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("destination_name", destinationName);
        values.put("destination_IATA_code", iataCode);
        values.put("destination_ICAO_code", icaoCode);
        db.insert("Destination", null, values);
        db.close();
    }

    public void addDeparturesRecord(String departuresName, int iataCode, int icaoCode) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("departures_name", departuresName);
        values.put("departures_IATA_code", iataCode);
        values.put("departures_ICAO_code", icaoCode);
        db.insert("Departures", null, values);
        db.close();
    }

    public Cursor getAllAirlineRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Airline", null);
    }

    public Cursor getAllAirportRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Airport", null);
    }

    public Cursor getAllPassengerRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Passenger", null);
    }

    public Cursor getAllBaggageRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Baggage", null);
    }

    public Cursor getAllFlightRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Flight", null);
    }

    public Cursor getAllCheckPointRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM CheckPoint", null);
    }

    public Cursor getAllTerminalRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Terminal", null);
    }

    public Cursor getAllDestinationRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Destination", null);
    }

    public Cursor getAllDeparturesRecords() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM Departures", null);
    }

}
