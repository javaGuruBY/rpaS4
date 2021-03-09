package by.jrr.product;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 0.8, 20);
        milk.printInformation();
        Product sugar = new Product();
        sugar.setName("Sugar");
        sugar.setRegularPrice(1.0);
        sugar.setDiscount(5);
        System.out.println();
        sugar.printInformation();
    }
}
