package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        Random random = new Random();
        int sumRandomNumv = 0;

        for (int i = 0; i < 3; i++) {
            int randomNumb = random.nextInt();
            System.out.println(randomNumb);
            sumRandomNumv += randomNumb;
        }

        System.out.println();
        System.out.println(sumRandomNumv);
    }
}
