package calculator.service;

public class Calculator {

    public int addition(int a, int b) {
                int        c=a + b;
        System.out.println("resultAddition= " + c);
        return c;
    }

    public int subtraction(int a, int b) {
        int c=a-b;
        System.out.println("resultSubstraction= " + c);
        return c;
    }

    public Double division(double a, double b) {
        double v = a / b;
        System.out.println("resultDivision= " + v);
        return v;
    }

    public int multiply(int a, int b) {

        int c= a * b;
        System.out.println("resultMultiply= " + c);
        return c;
    }
}
