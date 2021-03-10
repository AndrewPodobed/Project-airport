package com.company.reader;

import com.company.builder.FlightsBuilder;
import com.company.entity.Flights;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsDataReader implements FileDataReader<Flights>{

    private String filename;

    public FlightsDataReader(String filename){
        this.filename = filename;
    }


    @Override
    public List<Flights> read() {
        System.out.println("Старт записи в таблицу 'flights'");
        List<Flights> flightsList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String flightsLine = null;

            while ((flightsLine = reader.readLine()) != null) {
                Flights flights = FlightsBuilder.build(flightsLine);

                flightsList.add(flights);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return flightsList;
    }
}
