package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Airline extends AppCompatActivity {

    private DatabaseManager dbManager;
    private int airlineId;
    private String airlineName;
    private String IATACode;
    private String ICAOCode;

    public Airline(int airlineId, String airlineName, String IATACode, String ICAOCode) {
        this.airlineId = airlineId;
        this.airlineName = airlineName;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
    }
    // Геттеры и сеттеры
    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
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



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        int airl_id = getAirlineId();
        String airl_name = getAirlineName();
        int airl_iata = Integer.parseInt(getIATACode());
        int airl_icao = Integer.parseInt(getICAOCode());
        dbManager.addAirlineRecord(airl_id, airl_name,airl_iata,  airl_icao);
    }
}
