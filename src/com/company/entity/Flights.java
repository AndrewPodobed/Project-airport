package com.company.entity;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class Flights {
//    private int id;
    private int airplaneId;
    private int pilotId;
    private String date;
    private String time;
    private String flightsNum;

    public Flights(int airplaneId, int pilotId, String date, String time, String flightsNum) {
//        this.id = id;
        this.airplaneId = airplaneId;
        this.pilotId = pilotId;
        this.date = date;
        this.time = time;
        this.flightsNum = flightsNum;
    }


//    public int getId() {
//        return id;
//    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public int getPilotId() {
        return pilotId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getFlightsNum() {
        return flightsNum;
    }

    @Override
    public String toString() {
        return "Flights{" +
//                "id=" + id +
                "airplaneId=" + airplaneId +
                ", pilotId=" + pilotId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", flightsNum=" + flightsNum +
                '}';
    }
}
