package by.jrr.start;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    private double actualPrice()
    {
        if(this.discount<0 || this.discount>100) {
            System.out.println("Illegal value of discount");
            return -1;
        }
        else return regularPrice-regularPrice*discount/100;
    }

    void printInformation()
    {
        System.out.println("Product \t " + name);
        System.out.println("regular price \t " + regularPrice);
        System.out.println("discount \t " + discount + "%");
        System.out.println("actual prise \t " + actualPrice());
    }
}
