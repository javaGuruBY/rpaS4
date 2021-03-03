package circle;

import static java.lang.Double.NaN;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    double calculateArea() {
        if (radius > 0) {
            return Math.PI * (radius * radius);
        } else {
            System.out.println("Радиус имеет отрицательное значение.");
            return 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
