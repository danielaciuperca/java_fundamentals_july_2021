package com.daniela.relantionships;

public class Vehicle {
    public static final String PLATFORM = "GROUND";

    protected int speed;
    protected int seats;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
