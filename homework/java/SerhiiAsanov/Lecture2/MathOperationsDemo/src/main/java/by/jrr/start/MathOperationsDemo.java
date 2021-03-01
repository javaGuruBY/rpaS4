package by.jrr.start;

public class MathOperationsDemo {

    public static void main(String[] args) {

        MathOperationsDemo mod = new MathOperationsDemo();

        int a = 8;
        int b = 4;

        System.out.println("addition a + b = " + mod.addition(a, b));
        System.out.println("subtraction a - b = " + mod.subtraction(a, b));
        System.out.println("multiplication a +* b = " + mod.multiplication(a, b));
        System.out.println("division a / b = " + mod.division(a, b));
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
}
