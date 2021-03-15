package com.company.entity;

public class Planers {
    private int id;
    private String brand;
    private String model;
    private int countPassengers;
    private String numAirplane;

    public Planers(String brand, String model, int countPassengers, String numAirplane) {
//        this.id = id;
        this.brand = brand;
        this.model = model;
        this.countPassengers = countPassengers;
        this.numAirplane = numAirplane;
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

    public String getNumAirplane() {
        return numAirplane;
    }

    @Override
    public String toString() {
        return "Planers{" +
//                "id=" + id +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", countPassengers=" + countPassengers +
                ", numAirplane='" + numAirplane + '\'' +
                '}';
    }
}
