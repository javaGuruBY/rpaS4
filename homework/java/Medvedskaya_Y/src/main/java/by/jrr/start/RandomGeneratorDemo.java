package by.jrr.start;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        double a = random();
        double b = random();
        double c = random();

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);
        System.out.println("Sum of the numbers: " + sum(a,b,c));
    }
    public static double random()
    {
        return Math.random()*100;
    }

    public static double sum(double a, double b, double c)
    {
        return a+b+c;
    }
}
