package by.jrr.start;

/*
Описание:
Разработать программу, которая демонстрирует работу с простейшими математическими операциями.
Функциональные требования:
1. Продемонстрировать работу с операциями сложения, вычитания, умножения и деления,
и вывести результат вычислений на экран
 */
public class MathOperationsDemo {

    public static void main(String[] args) {
        calculate(2, 3, "add");
        calculate(12, 23, "sub");
        calculate(32, 34, "mult");
        calculate(25, 36, "div");
        calculate(25, 36, "addition");
    }

    public static void calculate(double a, double b, String command) {
        switch (command) {
            case "add": {
                System.out.println(a + " + " + b + " = " + addition(a, b));
                break;
            }
            case "sub": {
                System.out.println(a + " - " + b + " = " + subtraction(a, b));
                break;
            }
            case "mult": {
                System.out.println(a + " * " + b + " = " + multiplication(a, b));
                break;
            }
            case "div": {
                System.out.println(a + " / " + b + " = " + division(a, b));
                break;
            }
            default: {
                System.out.println("Команда не распознана.");
            }
        }
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}
