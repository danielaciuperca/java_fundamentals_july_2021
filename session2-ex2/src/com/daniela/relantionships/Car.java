package com.daniela.relantionships;

public class Car extends Vehicle {
    private String model;
    private String brand;
    private Engine engine; // Car has-A Engine
    private Options options; // Car has-A Options

    public Car(String model, String brand, Engine engine) {
        this.model = model;
        this.brand = brand;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
