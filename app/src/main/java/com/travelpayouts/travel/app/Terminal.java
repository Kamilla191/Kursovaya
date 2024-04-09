package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Terminal extends AppCompatActivity {
    private DatabaseManager dbManager;
    private int terminalId;
    private String terminalName;
    private int airportId;

    public Terminal(int terminalId, String terminalName, int airportId) {
        this.terminalId = terminalId;
        this.terminalName = terminalName;
        this.airportId = airportId;
    }
    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        String term_name = getTerminalName();
        int airp_id = getAirportId();
        dbManager.addTerminalRecord(term_name, airp_id);
    }
}
