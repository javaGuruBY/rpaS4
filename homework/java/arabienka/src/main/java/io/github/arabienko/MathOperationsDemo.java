package io.github.arabienko;

public class MathOperationsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        double sub;

        System.out.print("Операция суммы = a + b = ");
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);

        double x = 18;
        double y = 3.3;
        System.out.print("Операция деления = а / b = ");
        sub = x / y;
        System.out.println(x + " / " + y + " = " + sub);

        System.out.print("Операция умножения = ");
        int mult = a * b;
        System.out.println(a + " * " + b + " = " + mult);

        System.out.print("Операция вычетания = ");
        int del = a - b;
        System.out.println(a + " - " + b + " = " + del);
    }
}
