package com.travelpayouts.travel.app.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Aviasales_Database";
    private static final int DATABASE_VERSION = 1;

    // Конструктор
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Метод, который вызывается при создании базы данных
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Создание таблицы
        String createTableQueryAirline = "CREATE TABLE IF NOT EXISTS Airline ("
                + "airline_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "airline_name TEXT,"
                + "airline_iata_code INTEGER,"
                + "airlane_icao_code INTEGER)";
        db.execSQL(createTableQueryAirline);

        String createTableQueryAirport = "CREATE TABLE IF NOT EXISTS Airport ("
                + "airport_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "airport_name TEXT,"
                + "airport_address TEXT,"
                + "airport_iata_code INTEGER,"
                + "airport_icao_code INTEGER,"
                + "airport_latitude_longitude TEXT)";
        db.execSQL(createTableQueryAirport);

        String createTableQueryPassenger = "CREATE TABLE IF NOT EXISTS Passenger ("
                + "passanger_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "passanger_first_name TEXT,"
                + "passanger_last_name TEXT,"
                + "passanger_details INTEGER,"
                + "passanger_flight_id INTEGER)";
        db.execSQL(createTableQueryPassenger);

        String createTableQueryBaggage = "CREATE TABLE IF NOT EXISTS Baggage ("
                + "baggage_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "passanger_id INTEGER,"
                + "baggage_weight INTEGER,"
                + "baggage_dimensions INTEGER)";
        db.execSQL(createTableQueryBaggage);

        String createTableQueryFlight = "CREATE TABLE IF NOT EXISTS Flight ("
                + "flight_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "flight_number INTEGER,"
                + "flight_departure_date_time TEXT,"
                + "flight_arival_date_time TEXT,"
                + "flight_departure_airport_id INTEGER, "
                + "flight_arival_airport_id INTEGER,"
                + "flight_airline_id INTEGER,"
                + "flight_destinantion_id INTEGER,"
                + "flight_departure_time TEXT, "
                + "flight_arival_time TEXT)";
        db.execSQL(createTableQueryFlight);

        String createTableQueryCheckPoint = "CREATE TABLE IF NOT EXISTS CheckPoint ("
                + "check_point_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "check_point_name TEXT,"
                + "check_point_terminal_id INTEGER)";
        db.execSQL(createTableQueryCheckPoint);

        String createTableQueryTerminal = "CREATE TABLE IF NOT EXISTS Terminal ("
                + "terminal_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "terminal_name TEXT,"
                + "terminal_airport_id INTEGER)";
        db.execSQL(createTableQueryTerminal);

        String createTableQueryDestination = "CREATE TABLE IF NOT EXISTS Destination ("
                + "destination_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "destination_name TEXT,"
                + "destination_IATA_code INTEGER,"
                + "destination_ICAO_code INTEGER)";
        db.execSQL(createTableQueryDestination);

        String createTableQueryDepartures = "CREATE TABLE IF NOT EXISTS Departures ("
                + "departures_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "departures_name TEXT,"
                + "departures_IATA_code INTEGER,"
                + "departures_ICAO_code INTEGER)";
        db.execSQL(createTableQueryDepartures);
    }

    // Метод, который вызывается при обновлении базы данных (изменении версии)
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Для простоты удаляем старую таблицу и создаем новую
        db.execSQL("DROP TABLE IF EXISTS MyTable");
        onCreate(db);
    }
}