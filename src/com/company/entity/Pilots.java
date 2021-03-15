package com.company.entity;

public class Pilots {
//    private int id;
    private  String firstName;
    private String lastName;
    private String pilotRange;
    private String pilotCode;

    public Pilots(String firstName, String lastName, String pilotRange, String pilotCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pilotRange = pilotRange;
        this.pilotCode = pilotCode;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPilotRange() {
        return pilotRange;
    }

    public String getPilotCode() {
        return pilotCode;
    }

    @Override
    public String toString() {
        return "Pilots{" +
//                "id=" + id +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pilotRange='" + pilotRange + '\'' +
                ", pilotCode='" + pilotCode + '\'' +
                '}';
    }
}
