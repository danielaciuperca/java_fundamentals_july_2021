package p1;

import p1.p3.*;

public class Example3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Maestrul si Margareta";
        b1.author = "Mihai Bulgakov";
        b1.price = 36.5;
//        b1.onStock = true; onStock has private access

        Store store = new Store();
        store.setName("Store A");
        System.out.println("store name: " + store.getName());
    }
}
