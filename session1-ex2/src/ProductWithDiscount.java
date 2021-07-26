public class ProductWithDiscount {
    double price = 10;
    String name;
    int quantity;
//    final int quantityForDiscount = 2; //valoarea 2 se va pentru toate produsele create

    final int quantityForDiscount; //valoarea va fi distincta pt fiecare produs creat,
    //dar odata setata, nu va mai putea fi schimbata pt produsul respectiv

    ProductWithDiscount(int quantityForDiscount) {
        this.quantityForDiscount = quantityForDiscount;
    }

    ProductWithDiscount(double price, String name, int quantity, int quantityForDiscount) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.quantityForDiscount = quantityForDiscount;
    }

    void discount(int purchasedQuantity) {
        if(purchasedQuantity >= this.quantityForDiscount) {
            System.out.println(
                    "Congratulations! You have a discount for " + this.name);
        }
    }
}
