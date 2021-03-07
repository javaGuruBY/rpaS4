package by.jrr.start;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea()
    {
        return radius*radius*Math.PI;
    }
}
