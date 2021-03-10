package com.company;

import com.company.DataBaseUtil.reader.FullDataReader;
import com.company.DataBaseUtil.writer.FlightsDBWriter;
import com.company.DataBaseUtil.writer.PilotsDBWriter;
import com.company.DataBaseUtil.writer.PlanersDBWriter;
import com.company.entity.Flights;
import com.company.entity.Pilots;
import com.company.entity.Planers;
import com.company.reader.FileDataReader;
import com.company.reader.FlightsDataReader;
import com.company.reader.PilotDataReader;
import com.company.reader.PlanerDataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PilotDataReader pilotDataReader = new PilotDataReader("db\\data\\pilot.csv");
        List<Pilots> pilotsList= pilotDataReader.read();
        PilotsDBWriter.write(pilotsList);
        pilotsList.forEach(System.out::println);

        System.out.println("");

        PlanerDataReader planerDataReader = new PlanerDataReader("db\\data\\planer.csv");
        List<Planers> planersList = planerDataReader.read();
        PlanersDBWriter.write(planersList);
        planersList.forEach(System.out::println);

        FlightsDataReader flightsDataReader = new FlightsDataReader("db\\data\\flights.csv");
        List<Flights> flightsList = flightsDataReader.read();
        FlightsDBWriter.write(flightsList);
        flightsList.forEach(System.out::println);

        System.out.println("");

        FullDataReader.read().forEach(System.out::println);



    }
}
