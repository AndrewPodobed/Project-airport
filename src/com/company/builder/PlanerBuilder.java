package com.company.builder;

import com.company.entity.Flights;
import com.company.entity.Planers;

public class PlanerBuilder {
    public static Planers build(String planersLine) {
        String[] planerData = planersLine.split(";");

        String brand = planerData[0];
        String model = planerData[1];
        int count_passengers = Integer.parseInt(planerData[2]);
        String num_airplane = planerData[3];

        return new Planers(brand, model, count_passengers, num_airplane);
    }
}
