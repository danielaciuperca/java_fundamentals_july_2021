package com.daniela.exercise;

import java.io.*;
import java.util.*;

/*
    We are developing an app for a book library.
    Every item that is available to be borrowed from the library has a code and a title.
    There are 2 different types of items: books and magazines.
    The books also have an author.
    The magazines also have the month and year of publication.
    The app needs to manage the list of all items from the library.
    Any app user can add an item (a book or a magazine) in the library list of items.
    Also, any app user can see the details of all items.

    The app user interacts with the app via the console. So, the user will be able to give
    the following commands to the app:

    Please type a command:
    add
    Please type the item type you want to add:
    book
    Please type the details of the item:
    547856/One hundred years of solitude/Gabriel Garcia Marquez

    Please type a command:
    add
    Please type the item type you want to add:
    magazine
    Please type the details of the item:
    547856/National Geographic/6/2021

    Please type a command:
    view
    47856/One hundred years of solitude/Gabriel Garcia Marquez
    47856/One hundred years of solitude/Gabriel Garcia Marquez

    Please type a command:
    exit

 */
public class Application {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[2];
        int index = 0;
        if(index < notifications.length) {
            notifications[index] = new SmsNotification();
            index++;
        }
        if(index < notifications.length) {
            notifications[index] = new EmailNotification();
            index++;
        }
        if(index < notifications.length) {
            notifications[index] = new SmsNotification();
            //would throw an ArrayIndexOutOfBoundsException if index = 2
            index++;
        }
        Library library = new Library(notifications);

//        Scanner scanner = null;
//        if Scanner is null, scanner.nextLine() would throw NullPointerException
//        we should see why the scanner was null and fix the cause of the problem

        Scanner scanner = new Scanner(System.in);
        String line = "";
        while(true) {
            System.out.println("Please type a command:");
            line = scanner.nextLine();

            switch(line) {
                case "add" :
                    //add item
                    System.out.println("Please type the item type you want to add (book or magazine):");
                    line = scanner.nextLine();
                    switch(line) {
                        case "book" : {
                            System.out.println("Please type the details of the item:");
                            line = scanner.nextLine();
                                String[] values = line.split("/");
                                if (values.length != 3) {
                                    System.out.println("You must type 3 details for a book.");
                                } else {
                                    String code = values[0];
                                    String title = values[1];
                                    String author = values[2];
                                    Item book = new Book(code, title, author); //polimorfism
                                    try {
                                        library.addItem(book);
                                    } catch(TooManyItemsException e) {
                                        //code to handle the exception
                                        //code that will tell the app what to do if a TooManyItemsException occurs
                                        System.out.println(e.getMessage());
                                    }
                                }
                            }
                            break;
                        case "magazine" : {
                            System.out.println("Please type the details of the item:");
                            line = scanner.nextLine();
                                String[] values = line.split("/");
                                if(values.length != 4) {
                                    System.out.println("You must type 4 details for a magazine.");
                                } else {
                                    String code = values[0];
                                    String title = values[1];
                                    int publishingMonth = Integer.valueOf(values[2]);
                                    int publishingYear = Integer.valueOf(values[3]);
                                    Item magazine = new Magazine(code, title, publishingMonth, publishingYear);
                                    try {
                                        library.addItem(magazine);
                                        //...
                                    } catch(TooManyItemsException e) {
                                        logTooManyItemsException(e);
                                    } catch(Exception e) {
                                        System.out.println("There was a problem with the app.");
                                    } finally {//finally is optional
                                        System.out.println("Finished the attempt to add an item.");
                                    }
                                }
                            }
                            break;
                        default : System.out.println("This item type does not exists - " + line);
                    }
                    break;
                case "view" :
                    //view all items
                    library.viewItems();
                    break;
                case "exit" :
                    //stop the app
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                default : System.out.println("This command does not exist.");
            }
        }
    }

    private static void logTooManyItemsException(TooManyItemsException e) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("logs.txt");
            printWriter.println(e.getMessage());
            printWriter.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            if(printWriter != null) {
                printWriter.close();
            }
        }
//     e.printStackTrace();
    }
}
