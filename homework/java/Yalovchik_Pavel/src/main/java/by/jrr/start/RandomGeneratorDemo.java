package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args)  {
        Random random = new Random();
        int max = 100;
        int a = random.nextInt(max) + 1;
        System.out.println("a = " + a);
        int b = random.nextInt(max) + 1;
        System.out.println("b = " + b);
        int c = random.nextInt(max) + 1;
        System.out.println("c = " + c);
        int sum = a+b+c;
        System.out.println("a+b+c="+sum);


    }
}

