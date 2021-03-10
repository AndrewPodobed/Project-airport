package com.company.reader;

import com.company.builder.FlightsBuilder;
import com.company.builder.PilotsBuilder;
import com.company.entity.Flights;
import com.company.entity.Pilots;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotDataReader implements FileDataReader{
    private String filename;

    public PilotDataReader(String filename){
        this.filename = filename;
    }


    @Override
    public List<Pilots> read() {
        System.out.println("Старт записи в таблицу 'pilot'");
        List<Pilots> pilotsList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String pilotsLine = null;

            while ((pilotsLine = reader.readLine()) != null) {
                Pilots pilots = PilotsBuilder.build(pilotsLine);

                pilotsList.add(pilots);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return pilotsList;
    }
}
