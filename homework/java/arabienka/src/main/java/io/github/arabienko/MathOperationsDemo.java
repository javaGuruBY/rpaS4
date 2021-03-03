package io.github.arabienko;

public class MathOperationsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        double sub;
        substruction(5, 5);
        division(45, 10);
        multiplication(4, 86);
        calculate(5, 5);
    }

    static void substruction(int i, int i1) {
        System.out.print("Операция вычитания = a - b = ");
        int div = i - i1;
        System.out.println(i + " - " + i1 + " = " + div);
    }

    public static void division(double i, double i1) {
        System.out.print("Операция деления = a / b = ");
        double div = i / i1;
        System.out.println(i + " / " + i1 + " = " + div);
    }

    public static void multiplication(int i, int i1) {
        System.out.print("Операция умножения = a * b = ");
        int mult = i * i1;
        System.out.println(i + " * " + i1 + " = " + mult);
    }

    private static void calculate(int i, int i1) {
        System.out.print("Операция суммы = a + b = ");
        int sum = i + i1;
        System.out.println(i + " + " + i1 + " = " + sum);
    }
}
