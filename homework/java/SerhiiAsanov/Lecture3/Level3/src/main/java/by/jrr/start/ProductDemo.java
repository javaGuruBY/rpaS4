package by.jrr.start;

public class ProductDemo {

    public static void main(String[] args) {
        Product milk = new Product("President");

        milk.setRegularPrice(15);
        milk.setDiscount(17);

        milk.printInformation();
    }
}
