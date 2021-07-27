package p1;

/*  approach for packages naming:
    company name: google
    company internet domain: google.com
    packages name: com.google.product
                   com.google.customer
                   com.google.document
                   com.google.document.service

    package by layer versus package by feature

 */

/*
    moduri de acces:                modificatori de acces:
    public                          public
    protected                       protected
    default                         <absent>
    private                         private


    public: acces din orice pachet, daca ai importat clasa respectiva
    protected: acces din acelasi pachet si acces din clasele care mostenesc clasa respectiva
                (clasele care mostenesc se pot afla si in alte pachete)
    default: acces din acelasi pachet
    private: acces doar din clasa respectiva

 */
public class Book {
    String title;
    public String author;
    protected double price;
    private boolean onStock;

    public Book() { //mod de acces public
        this.onStock = true;
    }

}
