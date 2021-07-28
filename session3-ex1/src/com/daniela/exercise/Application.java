package com.daniela.exercise;

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
    view
    47856/One hundred years of solitude/Gabriel Garcia Marquez
    47856/One hundred years of solitude/Gabriel Garcia Marquez
    Please type a command:
    exit

 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        while(true) {
            System.out.println("Please type a command:");
            line = scanner.nextLine();

            switch(line) {
                case "add" :
                    //add item
                    break;
                case "view" :
                    //view all items
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
}
