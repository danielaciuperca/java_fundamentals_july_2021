public class Product {
    //atribute
    double price;
    String name;
    int quantity;

    //zone de memorie statice (ele tin de clasa, nu de instanta)
    static int numberOfProducts;
    static final String CURRENCY;
    //static - valoarea este unica per clasa, este shared de catre toate obiectele
    //final - valoarea nu poate fi schimbata, o data ce a primit o valoare

    static {
        //bloc de initializare static
        CURRENCY = "RON";
        System.out.println("Currency was set based on the configurations");
    }

    {
        //bloc de initializare
    }

    //constructori
    Product() {
        //constructor default (implicit, fara parametrii)
        numberOfProducts++;
    }

    Product(double price, String name, int quantity) {
        this.price = price; //this este referinta catre obiectul care se construieste
        this.name = name;
        this.quantity = quantity;
        numberOfProducts++;
    }

    //comportamente
    void discount(int purchasedQuantity, int quantityForDiscount) {
        if(purchasedQuantity >= quantityForDiscount) {
            System.out.println(
                    "Congratulations! You have a discount for " + this.name);
        }
    }
}
