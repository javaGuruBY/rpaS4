package by.jrr.start;

public class MathOperationsDemo {

    public static void main(String[] args) {

        int a = 8;
        int b = 4;

        System.out.println("addition a + b = " + addition(a, b));
        System.out.println("subtraction a - b = " + subtraction(a, b));
        System.out.println("multiplication a +* b = " + multiplication(a, b));
        System.out.println("division a / b = " + division(a, b));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }
}
