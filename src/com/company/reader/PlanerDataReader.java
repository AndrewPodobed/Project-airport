package com.company.reader;

import com.company.builder.FlightsBuilder;
import com.company.builder.PlanerBuilder;
import com.company.entity.Flights;
import com.company.entity.Planers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanerDataReader implements FileDataReader {
    private String filename;

    public PlanerDataReader(String filename){
        this.filename = filename;
    }


    @Override
    public List<Planers> read() {
        System.out.println("Старт записи в таблицу 'planers'");
        List<Planers> planersList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String planersLine = null;

            while ((planersLine = reader.readLine()) != null) {
                Planers planers = PlanerBuilder.build(planersLine);

                planersList.add(planers);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return planersList;
    }
}
