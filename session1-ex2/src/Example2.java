public class Example2 {
    public static void main(String[] args) {
//        ProductWithDiscount p1 =
//                new ProductWithDiscount(1000, "phone", 8, 5);
//        p1.discount(1);
//        p1.discount(9);
//
//        p1.quantityForDiscount = 3;
//        p1.discount(4);

        ProductWithDiscount p1 =
                new ProductWithDiscount(1000, "phone", 8, 5);
        p1.discount(1);
        p1.discount(9);
        p1.discount(4);

        ProductWithDiscount p2 =
                new ProductWithDiscount(2500, "iphone", 9, 7);
        p2.discount(1);
        p2.discount(9);
        p2.discount(4);

        final int x = 10;
//        x = 12; x este zona de memorie constanta (constanta locala in metoda main)
    }
}
