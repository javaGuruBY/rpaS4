package Lessons;

public class Circle {
    double radius;

    public double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("circle.calculateArea(12) = " + circle.calculateArea(12));
    }

}