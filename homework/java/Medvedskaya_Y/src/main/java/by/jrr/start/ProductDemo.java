package by.jrr.start;

public class ProductDemo {
    public static void main(String [] args)
    {
        Product hat = new Product("hat");
        hat.discount = 20;
        hat.regularPrice = 80;
        hat.printInformation();
    }
}
