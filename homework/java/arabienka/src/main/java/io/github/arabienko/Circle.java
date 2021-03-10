package io.github.arabienko;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        double calculateSpace = Math.PI * radius * radius;
        return calculateSpace;
    }


    public void printArea() {
        System.out.println("Area circle (radius " + radius + " ) = " + calculateArea());
    }
}
