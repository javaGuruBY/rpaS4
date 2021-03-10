package io.github.arabienko;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("Cheese");
        product.setDiscount(20);
        product.setRegularPrice(0.8);

        product.actualPrice();
    }
}