package by.jrr.start.Randomizer;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void generateNumbersAndSummize() {
        Random random = new Random();

        int firstNumber = random.nextInt(100);
        int secondNumber = random.nextInt(100);
        int thirdNumber = random.nextInt(100);

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        System.out.println(firstNumber+secondNumber+thirdNumber);
    }

    public static void main(String[] args) {
        generateNumbersAndSummize();
    }


}
