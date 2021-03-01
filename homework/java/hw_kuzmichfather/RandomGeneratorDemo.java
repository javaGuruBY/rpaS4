import java.until.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int unboundRandom1 = randomGenerator.nextInt(); // Генерация 1-го числа
        System.out.println("We are getting a first random number = " + unboundRandom1);

        int unboundRandom2 = randomGenerator.nextInt(); // Генерация 2-го числа
        System.out.println("We are getting a second random number = " + unboundRandom2);

        int unboundRandom3 = randomGenerator.nextInt(); // Генерация 3-го числа
        System.out.println("We are getting a third random number = " + unboundRandom3);

        int sumofnumbers = unboundRandom1 + unboundRandom2 + unboundRandom3;

        System.out.println("Sum of random numbers = " + sumofnumbers);


        System.out.println("Smaller number generator");

        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("We are getting a first random number = " + random_number1);

        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        System.out.println("We are getting a second random number = " + random_number2);

        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("We are getting a third random number = " + random_number3);

        int sumofnumbers2 = random_number1 + random_number2 + random_number3;

        System.out.println("Sum of random numbers = " + sumofnumbers2);
    }
}

