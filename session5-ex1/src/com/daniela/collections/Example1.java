package com.daniela.collections;

import java.util.*;

/*
    Collections framework: java.util package

    Collection<E>                       Map<K, V>
        List<E>                              HashMap<K, V>
            ArrayList<E>                     LinkedHashMap<K, V>
            LinkedList<E>                    TreeMap<K, V>
        Set<E>
            HashSet<E>
            LinkedHashSet<E>
            TreeSet<E>

 */
public class Example1 {
    public static ArrayList<String> values = new ArrayList<>();
    //this list behaves as a normal attribute
    //it can have modifiers like private, public, static, final etc

    /*
        ArrayList<E> implements List<E> extends Collection<E>

     */
    public static void main(String[] args) {
        final ArrayList<String> cities = new ArrayList<>();

        System.out.println("cities.size(): " + cities.size());
        System.out.println("cities.isEmpty(): " + cities.isEmpty());

        cities.add("Bucuresti");
        cities.add("Cluj");
        cities.add("Brasov");
        cities.add("Constanta");
        cities.add("Bucuresti");

        System.out.println("First element: " + cities.get(0));
        System.out.println("Third element: " + cities.get(2));

        for(String city : cities) {
            System.out.print(city + ", ");
        }
        System.out.println("");

        System.out.println("Cities contains Iasi: " + cities.contains("Iasi"));

        cities.clear();
        System.out.println("cities.isEmpty(): " + cities.isEmpty());

        cities.add("Bucuresti");
        cities.add("Cluj");
        cities.add("Brasov");
        System.out.println("cities.size(): " + cities.size());

        cities.remove("Bucuresti");
        cities.remove(1);
        for(String city : cities) {
            System.out.print(city + ", ");
        }
        System.out.println("");

        //a primitive cannot be used for a generic type
        //we must use the wrapper class of that primitive
        //we use Integer for the primitive int
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        ArrayList<ArrayList<Integer>> listOfListOfNumbers = new ArrayList<>();
        listOfListOfNumbers.add(numbers);
        System.out.println(listOfListOfNumbers.get(0));

//        numbers.sort();
//        Collections.sort(numbers, );


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("nm book", "author1", 2000));
        books.add(new Book("dt book", "author2", 1998));
        books.add(new Book("fl book", "author3", 2020));
        System.out.println(books);

        Collections.sort(books);
        System.out.println("Book sorted by title: " + books);

        Collections.sort(books, new BookComparator());
        System.out.println("Books sorted by publishing year: " + books);

        books.sort(new BookComparator());
        System.out.println("Books sorted by publishing year: " + books);



    }
}
