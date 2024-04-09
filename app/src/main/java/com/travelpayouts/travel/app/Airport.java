package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Airport extends AppCompatActivity {

    private DatabaseManager dbManager;
    private int airportId;
    private String airportName;
    private String airportAddress;
    private String IATACode;
    private String ICAOCode;
    private String latitudeLongitude;

    public Airport(int airportId, String airportName, String airportAddress, String IATACode, String ICAOCode, String latitudeLongitude) {
        this.airportId = airportId;
        this.airportName = airportName;
        this.airportAddress = airportAddress;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
        this.latitudeLongitude = latitudeLongitude;
    }

    // Геттеры и сеттеры
    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportAddress() {
        return airportAddress;
    }

    public void setAirportAddress(String airportAddress) {
        this.airportAddress = airportAddress;
    }

    public String getIATACode() {
        return IATACode;
    }

    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    public String getICAOCode() {
        return ICAOCode;
    }

    public void setICAOCode(String ICAOCode) {
        this.ICAOCode = ICAOCode;
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        int airp_id = getAirportId();
        String airp_name = getAirportName();
        String airp_address = getAirportAddress();
        int airp_iata_code = Integer.parseInt(getIATACode());
        int airp_icao_code = Integer.parseInt(getICAOCode());
        dbManager.addAirportRecord(airp_id, airp_name, airp_address, airp_iata_code, airp_icao_code);
    }

}
