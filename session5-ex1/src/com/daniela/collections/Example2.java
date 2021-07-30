package com.daniela.collections;

import java.util.*;

/*
    Set<E>
            HashSet<E>        - no order, no sorting
            LinkedHashSet<E>  - ordered, no sorting
            TreeSet<E>        - sorted
 */
public class Example2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bucuresti");
        cities.add("Brasov");
        cities.add("Timisoara");
        cities.add("Alba Iulia");
        boolean duplicateCityAdded = cities.add("Bucuresti");

        System.out.print("cities: ");
        for(String city : cities) {
            System.out.print(city + ",");
        }
        System.out.println("");
        System.out.println("duplicateCityAdded: " + duplicateCityAdded);


        LinkedHashSet<String> orderedCities = new LinkedHashSet<>();
        orderedCities.add("Bucuresti");
        orderedCities.add("Brasov");
        orderedCities.add("Timisoara");
        orderedCities.add("Alba Iulia");
        orderedCities.add("Bucuresti");
        System.out.println("orderedCities: " + orderedCities);

        TreeSet<String> sortedCities = new TreeSet<>();
        sortedCities.add("Bucuresti");
        sortedCities.add("Brasov");
        sortedCities.add("Timisoara");
        sortedCities.add("Alba Iulia");
        sortedCities.add("Bucuresti");
        System.out.println("sortedCities: " + sortedCities);
    }
}
