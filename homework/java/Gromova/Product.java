package Lessons;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public double actualPrice(){
        double actualPrice = regularPrice*(1-discount/100);
        return actualPrice;
        }

        public void printInformation(){
            System.out.println("Product : name = " + name +", regular price = "+regularPrice +" EUR, discount = "+discount+"%, actual price = "+actualPrice()+" EUR");
    }
}
class ProductDemo{
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Chocolate";
        product.regularPrice = 5;
        product.discount = 15;
        product.printInformation();
    }
}
