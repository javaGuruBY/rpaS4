package homework.java.PilipenkoAlex.lecture.lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathOperationsDemo {
    public static void main(String[] args) throws IOException {
        startApplication();
    }
    public static void startApplication() throws IOException {
        System.out.println("Введите 2 числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        reader.close();
        MathOperationsDemo mathOperationsDemo = new MathOperationsDemo();
        mathOperationsDemo.additionOfNumbers(a, b);
        mathOperationsDemo.subtractionOfNumbers(a, b);
        mathOperationsDemo.multiplicationOfNumbers(a, b);
        mathOperationsDemo.divisionByNumber(a, b);
    }
    public void additionOfNumbers(int a, int b){
        int sum = a + b;
        System.out.println("Операция сложения двух чисел: " + a + " и " + b + " = " + sum);
    }
    public void subtractionOfNumbers(int a, int b){
        int sub = a - b;
        System.out.println("Операция вычитания двух чисел: " + a + " и " + b + " = " + sub);
    }
    public void multiplicationOfNumbers(int a, int b){
        int multi = a * b;
        System.out.println("Операция умножения двух чисел: " + a + " и " + b + " = " + multi);
    }
    public void divisionByNumber(int a, int b){
        double division = (double) a / (double) b;
        System.out.println("Операция деления двух чисел: " + a + " и " + b + " = " + division);
    }


}


