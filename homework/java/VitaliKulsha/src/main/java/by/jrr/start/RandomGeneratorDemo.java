package by.jrr.start;
/*
Описание:
Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.
Функциональные требования:
1. Сгенерировать 3 случайных числа и вывести их на экран.
2. Посчитать сумму этих чисел и вывести результат на экран.
 */

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        random();
    }

    public static void random() {
        Random random = new Random();
        int sum = 0;
        int max = 10;
        for (int i = 1; i <= 3; i++) {
            int randomNum = random.nextInt(max) + 1;
            System.out.println("Число #" + i + " " + randomNum);
            sum += randomNum;
        }
        System.out.println("Сумма случайных чисел равна " + sum);
    }
}
