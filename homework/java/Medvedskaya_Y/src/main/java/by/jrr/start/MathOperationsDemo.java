package by.jrr.start;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, "+"));
        System.out.println(calculate(1.2, 2, "*"));
        System.out.println(calculate(1, 2.2, "%"));
        System.out.println(calculate(1, 2.3, "/"));
        System.out.println(calculate(3, 2.2, "-"));
    }

    private static double addition(double a, double b)
    {
        return a+b;
    }
    private static double division(double a, double b)
    {
        return a/b;
    }
    private static double multiplication(double a, double b)
    {
        return a*b;
    }
    private static double remainder(double a, double b)
    {
        return a%b;
    }
    private static double subtraction(double a, double b)
    {
        return a-b;
    }

    public static double calculate(double a, double b, String command) {
        switch (command){
            case "+":
                return addition(a, b);
            case "/":
                return division(a, b);
            case "*":
                return multiplication(a, b);
            case "%":
                return remainder(a,b);
            case "-":
                return subtraction(a,b);
            default:
                System.out.println("Operation not supported");
                return 0;
        }
    }
}
