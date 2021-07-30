package com.daniela.collections;

import java.util.*;

/*
    Map<K, V>
        HashMap<K, V>         - no order, no sorting
        LinkedHashMap<K, V>   - ordered by key, no sorting
        TreeMap<K, V>         - sorted by key

 */
public class Example3 {
    public static void main(String[] args) {
        HashMap<String, Integer> populations = new HashMap<>();//the order of the generics types matters!!
        populations.put("Bucuresti", 2000000);
        populations.put("Brasov", 300000);
        populations.put("Alba Iulia", 150000);
        populations.put("Timisoara", 400000);
        populations.put("Bucuresti", 2100000);//if the key already exists, the existing value will be overwritten

        System.out.println("populations: ");
        for(String city : populations.keySet()) {
            System.out.println(city + " - " + populations.get(city));
        }

        populations.remove("Alba Iulia");
        System.out.println(populations);

        LinkedHashMap<String, Integer> orderedPopulations = new LinkedHashMap<>();
        orderedPopulations.put("Bucuresti", 2000000);
        orderedPopulations.put("Brasov", 300000);
        orderedPopulations.put("Alba Iulia", 150000);
        orderedPopulations.put("Timisoara", 400000);
        orderedPopulations.put("Bucuresti", 2100000);
        System.out.println("orderedPopulations: " + orderedPopulations);

        TreeMap<String, Integer> sortedPopulations = new TreeMap<>();
        sortedPopulations.put("Bucuresti", 2000000);
        sortedPopulations.put("Brasov", 300000);
        sortedPopulations.put("Alba Iulia", 150000);
        sortedPopulations.put("Timisoara", 400000);
        sortedPopulations.put("Bucuresti", 2100000);
        System.out.println("sortedPopulations: " + sortedPopulations);
    }
}
