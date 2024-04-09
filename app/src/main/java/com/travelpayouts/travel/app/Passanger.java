package com.travelpayouts.travel.app;

import com.travelpayouts.travel.app.database.DatabaseManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class Passanger extends AppCompatActivity {

    private DatabaseManager dbManager;
    private int passengerId;
    private String firstName;
    private String lastName;
    private int passportDetails;
    private int flightId;

    public Passanger(int passengerId, String firstName, String lastName, String passportDetails, int flightId) {
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportDetails = Integer.parseInt(passportDetails);
        this.flightId = flightId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportDetails() {
        return passportDetails;
    }

    public void setPassportDetails(int passportDetails) {
        this.passportDetails = passportDetails;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        dbManager = new DatabaseManager(this);
        String pass_first_name = getFirstName();
        String pass_last_name = getLastName();
        int pass_det = getPassportDetails();
        int pass_fligh_id = getFlightId();
        dbManager.addPassengerRecord(pass_first_name, pass_last_name, pass_det, pass_fligh_id);
    }
}
