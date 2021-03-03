package by.jrr.product;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public Product() {
    }

    public double actualPrice() {
        return regularPrice * (1 - discount / 100);
    }

    public void printInformation() {
        System.out.printf("Product: name = \"%s\", regular price = %.2f EUR, discount = %.0f" +
                "%%, actual price = %.2f EUR", name, regularPrice, discount, actualPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = '" + name + '\'' +
                ", regular price = " + regularPrice +
                " EUR, discount = " + discount +
                "%, actual price = " + actualPrice() + " EUR";

    }
}
