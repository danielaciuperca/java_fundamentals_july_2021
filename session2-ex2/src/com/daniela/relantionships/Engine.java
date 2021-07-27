package com.daniela.relantionships;

public class Engine {
    private int power;
    private String transmission;

    public Engine(int power, String transmission) {
        this.power = power;
        this.transmission = transmission;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
