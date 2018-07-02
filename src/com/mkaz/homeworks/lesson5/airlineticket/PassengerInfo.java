package com.mkaz.homeworks.lesson5.airlineticket;

public class PassengerInfo {
    private final String name;
    private final String surname;
    private final String passportID;

    public PassengerInfo(String name, String surname, String passportID) {
        this.name = name;
        this.surname = surname;
        this.passportID = passportID;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportID='" + passportID + '\'' +
                '}';
    }
}
