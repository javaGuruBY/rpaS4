package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {

    public int sumRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber + " ");
            sum += randomNumber;
        }
        return sum;
    }

    public static void main(String[] args) {
        RandomGeneratorDemo rgd = new RandomGeneratorDemo();
        System.out.println("3 random numbers:");
        System.out.println("sum of the numbers = " + rgd.sumRandomNumbers());
    }
}
