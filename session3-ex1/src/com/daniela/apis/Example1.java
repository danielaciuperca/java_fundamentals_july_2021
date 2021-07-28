package com.daniela.apis;

public class Example1 {
    public static void main(String[] args) {
        String message1 = "Hello world";// this value will be stored in the String Pool
        String message2 = "Hello world";// this value is not reserved again in the memory
                                //message2 will reference to the same object as message1
        if(message1 == message2) {
            System.out.println("message1 and message2 reference the same object");
        }

        String message3 = new String("Hello world");
        //this value will be always a new object created in memory
        if(message1 != message3) {
            System.out.println("message1 and message3 reference different objects");
        }

        if(message1.equals(message2)) {
            System.out.println("message1 and message2 have the same characters");
        }
        if(message1.equals(message3)) {
            System.out.println("message1 and message3 have the same characters");
        }

        String message4 = "hello world";
        System.out.println(message1.equals(message4));
        System.out.println(message1.equalsIgnoreCase(message4));
        System.out.println("number of characters for meesage1: " + message1.length());
        System.out.println("message1 contains w: " + message1.contains("w"));
        System.out.println(message1.substring(2));
        System.out.println(message1.substring(2, 4));
        System.out.println(message1.startsWith("s"));
        System.out.println(message1.endsWith("world"));
        System.out.println(message1.isEmpty());
        System.out.println("".isEmpty());

        String text1 = "abc";
        String text2 = "def";
        System.out.println("text1.concat(text2): " + text1.concat(text2));
        System.out.println("text1: " + text1); // text1 remains "abc" because Strings are immutable
        String text3 = text1.concat(text2);
        System.out.println("text3: " + text3);

        StringBuilder sbMessage1 = new StringBuilder("test"); //StringBuilder is mutable
        sbMessage1.append(" for string builder"); //modifies the value existing in the smMessage1 object
        System.out.println("sbMessage1: " + sbMessage1);
    }
}
