package com.daniela.relantionships;

/*
     Relationships between classes:

     has-A (composition)            is-A (inheritance)


 */
public class Example1 {
    public static void main(String[] args) {
        Engine engine = new Engine(120, "manual");
        Car car = new Car("Logan", "Dacia", engine);

        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getEngine().getPower());
        System.out.println(car.getEngine().getTransmission());
    }
}
