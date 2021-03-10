package com.company.entity;

public class Planers {
    private int id;
    private String brend;
    private String model;
    private int countPassengers;
    private String numAirplane;

    public Planers(String brend, String model, int countPassengers, String numAirplane) {
//        this.id = id;
        this.brend = brend;
        this.model = model;
        this.countPassengers = countPassengers;
        this.numAirplane = numAirplane;
    }

//    public int getId() {
//        return id;
//    }

    public String getBrend() {
        return brend;
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
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", countPassengers=" + countPassengers +
                ", numAirplane='" + numAirplane + '\'' +
                '}';
    }
}
