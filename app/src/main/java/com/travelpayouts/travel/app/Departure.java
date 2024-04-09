package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Departure extends AppCompatActivity {
    private DatabaseManager dbManager;
    private int departureId;
    private String departureName;
    private String IATACode;
    private String ICAOCode;
    public Departure(int departureId, String departureName, String IATACode, String ICAOCode) {
        this.departureId = departureId;
        this.departureName = departureName;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
    }
    public int getDepartureId() {
        return departureId;
    }

    public void setDepartureId(int departureId) {
        this.departureId = departureId;
    }

    public String getDepartureName() {
        return departureName;
    }

    public void setDepartureName(String departureName) {
        this.departureName = departureName;
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
        String dep_name = getDepartureName();
        int iata_code = Integer.parseInt(getIATACode());
        int icao_cod = Integer.parseInt(getICAOCode());
        dbManager.addDeparturesRecord(dep_name, iata_code, icao_cod);
    }
}
