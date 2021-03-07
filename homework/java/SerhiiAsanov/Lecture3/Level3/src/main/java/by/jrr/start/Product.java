package by.jrr.start;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        double percent = regularPrice * (discount / 100);
        return regularPrice - percent;
    }

    public void printInformation() {
        System.out.printf("Name = %s, regular price = %s eur, discount = %s, actual price = %s eur",
                name, regularPrice, discount, actualPrice());
    }
}
