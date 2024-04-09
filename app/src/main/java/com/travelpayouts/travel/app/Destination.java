package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Destination extends AppCompatActivity {
    private DatabaseManager dbManager;
    private int destinationId;
    private String destinationName;
    private String IATACode;
    private String ICAOCode;

    public Destination(int destinationId, String destinationName, String IATACode, String ICAOCode) {
        this.destinationId = destinationId;
        this.destinationName = destinationName;
        this.IATACode = IATACode;
        this.ICAOCode = ICAOCode;
    }
    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
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
        String des_name = getDestinationName();
        int iata_code = Integer.parseInt(getIATACode());
        int icao_code = Integer.parseInt(getIATACode());
        dbManager.addDestinationRecord(des_name, iata_code, icao_code);
    }
}
