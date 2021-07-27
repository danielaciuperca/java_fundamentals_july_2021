package p2;

import p1.*; //se importa toate clasele care se afla direct in pachetul p1
             //nu se importa si subpachetele lui p1
import p1.p3.Store;

public class Example4 {
    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.title = "Maestrul si Margareta"; - title are acces default (package access)
        b1.author = "Mihai Bulgakov";
//        b1.price = 36.5; - price has protected access
//        b1.onStock = true; - onStock has private access

        Store s1 = new Store();
    }
}
