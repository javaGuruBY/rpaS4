package Lessons;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int firstRandom = random.nextInt(5) + 1;
        int secondRandom = random.nextInt(5) + 1;
        int thirdRandom = random.nextInt(5) + 1;
        int additionOfRandomNums = firstRandom + secondRandom + thirdRandom;
        System.out.println("firstRandom = " + firstRandom);
        System.out.println("secondRandom = " + secondRandom);
        System.out.println("thirdRandom = " + thirdRandom);
        System.out.println("additionOfRandomNums = " + additionOfRandomNums);
    }

}
