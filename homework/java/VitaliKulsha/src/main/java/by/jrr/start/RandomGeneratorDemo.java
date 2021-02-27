package by.jrr.start;
/*
Описание:
Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.
Функциональные требования:
1. Сгенерировать 3 случайных числа и вывести их на экран.
2. Посчитать сумму этих чисел и вывести результат на экран.
 */

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int maxNum = 1000;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int num = random(maxNum);
            System.out.println("Число №" + (i + 1) + " = " + num);
            sum += num;
        }
        System.out.println("Сумма сулучайных чисел sum = " + sum);
    }

    public static int random(int maxNum) {
        return (int) (Math.random() * maxNum);
    }
}
