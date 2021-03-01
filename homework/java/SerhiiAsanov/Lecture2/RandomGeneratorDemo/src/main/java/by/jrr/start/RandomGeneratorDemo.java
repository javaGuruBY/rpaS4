package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            System.out.println(random.nextInt());
        }
    }
}
