package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Checkpoint extends AppCompatActivity {

    private DatabaseManager dbManager;
    private int checkpointId;
    private String checkpointName;
    private int terminalId;

    public Checkpoint(int checkpointId, String checkpointName, int terminalId) {
        this.checkpointId = checkpointId;
        this.checkpointName = checkpointName;
        this.terminalId = terminalId;
    }

    public int getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(int checkpointId) {
        this.checkpointId = checkpointId;
    }

    public String getCheckpointName() {
        return checkpointName;
    }

    public void setCheckpointName(String checkpointName) {
        this.checkpointName = checkpointName;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        String check_name = getCheckpointName();
        int ter_id = getTerminalId();
        dbManager.addCheckPointRecord(check_name, ter_id);
    }
}
