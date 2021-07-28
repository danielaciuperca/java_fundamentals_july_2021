package com.daniela.apis;
/*
    wrapper classes:
    Byte
    Short
    Integer
    Long
    Float
    Double
    Character
    Boolean

 */
public class Example3 {
    public static void main(String[] args) {
        Integer x1 = 10;
        int x2 = 10;
        Integer x3 = Integer.valueOf(15);
        Integer x4 = Integer.valueOf("20");
        Integer x5 = Integer.parseInt("30");

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("x5: " + x5);
    }
}
