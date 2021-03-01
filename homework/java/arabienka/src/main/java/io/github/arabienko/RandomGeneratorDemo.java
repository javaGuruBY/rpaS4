package io.github.arabienko;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int sum = 0;
        Random generationRandom = new Random();
       /* int numberRandom = generationRandom.nextInt();
        int numberBoundRandom = generationRandom.nextInt(25);*/
        int numberBoundRandom, numberRandom;

        for (int i = 1; i < 4; i++) {
            numberRandom = generationRandom.nextInt();
            System.out.println("Рандомное число №" + i + " = " + numberRandom);
            sum = sum + numberRandom;
        }
        System.out.println("Сумма рандомных значение = " + sum);
    }
}
