package by.jrr.start;

public class MathOperationsDemo {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        MathOperationsDemo mod = new MathOperationsDemo();
        System.out.println("a + b = " + mod.addition(a, b));
        System.out.println("a - b = " + mod.subtraction(a, b));
        System.out.println("a * b = " + mod.multiplication(a, b));
        System.out.println("a / b = " + mod.division(a, b));
    }
}
