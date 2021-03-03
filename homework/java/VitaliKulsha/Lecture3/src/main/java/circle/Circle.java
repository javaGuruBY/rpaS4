package circle;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double calculateArea() {
        if (radius > 0 && radius != Double.POSITIVE_INFINITY) {
            return Math.PI * (radius * radius);
        } else {
            System.out.println("Radius set incorrectly. Return 0.");
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
