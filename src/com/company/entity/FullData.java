package com.company.entity;

import java.util.Date;

public class FullData {
    private String flightsNum;
    private Date date;
    private String time;
    private String numAirplane;
    private String brand;
    private String model;
    private int countPassengers;
    private  String firstName;
    private String lastName;
    private PilotRange range;
    private String pilotCode;

    public FullData(String flightsNum, Date date, String time, String numAirplane, String brand, String model, int countPassengers, String firstName, String lastName, PilotRange range, String pilotCode) {
        this.flightsNum = flightsNum;
        this.date = date;
        this.time = time;
        this.numAirplane = numAirplane;
        this.brand = brand;
        this.model = model;
        this.countPassengers = countPassengers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.range = range;
        this.pilotCode = pilotCode;
    }


    public String getFlightsNum() {
        return flightsNum;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getNumAirplane() {
        return numAirplane;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PilotRange getRange() {
        return range;
    }

    public String getPilotCode() {
        return pilotCode;
    }

    @Override
    public String toString() {
        return  "Номер рейса: " + flightsNum +
                ", Дата: " + date +
                ", Время: " + time +
                ", Бортовой номер: " + numAirplane +
                ", Марка самолета: " + brand +
                " " + model +
                ", Пассажирских мест: " + countPassengers +
                ", Пилот:" + firstName +
                " " + lastName + "." +
                ", Код: " + pilotCode +
                "(" + range + ")"
                ;
    }
}
