package com.daniela.relantionships;
/*
    Bicycle is-A Vehicle
    Bicycle = child class
    Vehicle = parent class, super class

 */
public class Bicycle extends Vehicle {
    private int weight;
    private String type;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printDetails() {
        System.out.println(weight + " / " + type + " / " + speed + " / " + seats);
    }
}
