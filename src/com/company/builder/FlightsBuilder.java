package com.company.builder;

import com.company.entity.Flights;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FlightsBuilder {
    public static Flights build(String flightsLine) {
        String[] flightsData = flightsLine.split(";");

        int airplaneId = Integer.parseInt(flightsData[0]);
        int pilotId = Integer.parseInt(flightsData[1]);
        String dateNum = flightsData[2];
        String timeNum = flightsData[3];
        String flightsNum = flightsData[4];

        return new Flights(airplaneId, pilotId, dateNum, timeNum, flightsNum);
    }

}
