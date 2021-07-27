package com.daniela.relantionships;

public class Example2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(100);
        vehicle.setSeats(2);

        Bicycle bicycle = new Bicycle();
        bicycle.setWeight(20);
        bicycle.setType("Mountain bike");
        bicycle.setSpeed(25);
        bicycle.setSeats(1);
        bicycle.printDetails();
    }
}
