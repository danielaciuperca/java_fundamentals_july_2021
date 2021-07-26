public class Example1 {
    public static void main(String[] args) {

        System.out.println("Number of products: " + Product.numberOfProducts);

        Product product = new Product(); //apel de constructor implicit

        System.out.println(product.price);
        System.out.println(product.name);
        System.out.println(product.quantity);

        product.price = 200.25;
        product.name = "mouse";
        product.quantity = 3;

        System.out.println("product.price: " + product.price);
        System.out.println("product.name: " + product.name);
        System.out.println("product.quantity: " + product.quantity);

        Product product2 = new Product(3000.78, "laptop", 6);
        System.out.println("product2.price: " + product2.price);
        System.out.println("product2.name: " + product2.name);
        System.out.println("product2.quantity: " + product2.quantity);

        product.discount(5, 2);
        product.discount(5, 7);
        product.discount(10, 4);
        product2.discount(7, 3);

        System.out.println("Number of products: " + Product.numberOfProducts);
    }
}
