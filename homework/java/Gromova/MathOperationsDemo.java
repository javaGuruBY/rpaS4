package Lessons;

public class MathOperationsDemo {
    int a;
    int b;
    
    public static void main(String[] args) {
        System.out.println(addition(5,2));
        System.out.println(subtraction(6,1));
        System.out.println(multiplication(5,9));
        System.out.println(division(6,2));
    }
    
    public static int addition( int a, int b){
        return a+b;
    }

    public static int subtraction( int a, int b){
        return a-b;
    }

    public static int multiplication( int a, int b){
        return a*b;
    }

    public static double division(int a, int b){
        double result = 0;
        if(b>0) {
            result= a / b;
        } else {
            System.out.println("Please enter notNull");
        } return result;
    }

    
}
