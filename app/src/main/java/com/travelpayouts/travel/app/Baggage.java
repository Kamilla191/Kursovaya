package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Baggage extends AppCompatActivity {
    private DatabaseManager dbManager;
    private int baggageId;
    private int passengerId;
    private double baggageWeight;
    private int baggageDimensions;

    public Baggage(int baggageId, int passengerId, double baggageWeight, int baggageDimensions) {
        this.baggageId = baggageId;
        this.passengerId = passengerId;
        this.baggageWeight = baggageWeight;
        this.baggageDimensions = baggageDimensions;
    }

    public int getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(int baggageId) {
        this.baggageId = baggageId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public int getBaggageDimensions() {
        return baggageDimensions;
    }

    public void setBaggageDimensions(int baggageDimensions) {
        this.baggageDimensions = baggageDimensions;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        int bag_pas_id = getPassengerId();
        int bag_wei = (int) getBaggageWeight();
        int bag_dem = getBaggageDimensions();
        dbManager.addBaggageRecord(bag_pas_id, bag_wei, bag_dem);
    }
}
