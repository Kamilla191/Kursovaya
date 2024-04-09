package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Flight extends AppCompatActivity {
    private DatabaseManager dbManager;
    private int flightId;
    private String flightNumber;
    private String departureDateTime;
    private String arrivalDateTime;
    private int departureAirportId;
    private int arrivalAirportId;
    private int airlineId;
    private int destinationId;
    private String departureTime;
    private String arrivalTime;

    public Flight(int flightId, String flightNumber,String departureDateTime, String arrivalDateTime,
                  int departureAirportId, int arrivalAirportId, int airlineId, int destinationId, String departureTime, String arrivalTime) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.departureAirportId = departureAirportId;
        this.arrivalAirportId = arrivalAirportId;
        this.airlineId = airlineId;
        this.destinationId = destinationId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public int getDepartureAirportId() {
        return departureAirportId;
    }

    public void setDepartureAirportId(int departureAirportId) {
        this.departureAirportId = departureAirportId;
    }

    public int getArrivalAirportId() {
        return arrivalAirportId;
    }

    public void setArrivalAirportId(int arrivalAirportId) {
        this.arrivalAirportId = arrivalAirportId;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        int fli_num = Integer.parseInt(getFlightNumber());
        String dep_time = getDepartureDateTime();
        String ari_time = getArrivalDateTime();
        int dep_air_id = getDepartureAirportId();
        int ari_air_id = getArrivalAirportId();
        int airl_id = getAirlineId();
        int dest_id = getDestinationId();
        String depp_time = getDepartureTime();
        String arii_time = getArrivalTime();
        dbManager.addFlightRecord(fli_num, dep_time, ari_time, dep_air_id, ari_air_id, airl_id, dest_id, depp_time, arii_time);
    }
}
