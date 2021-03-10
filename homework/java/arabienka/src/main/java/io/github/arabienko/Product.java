package io.github.arabienko;

public class Product {
   private String name;
   private double regularPrice;
   private int discount;

    public Product(String name) {
        this.name=name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public void actualPrice() {
        int adsotki=100;
        double discountPrice= regularPrice*discount/adsotki;
        System.out.printf("Name = %s, regular price = %f eur, discount = %d (percent), actual price = %f eur",
                name, regularPrice, discount,regularPrice-discountPrice);
    }
}
