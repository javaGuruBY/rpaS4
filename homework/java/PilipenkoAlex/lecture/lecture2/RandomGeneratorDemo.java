package homework.java.PilipenkoAlex.lecture.lecture2;

public class RandomGeneratorDemo {
    int bottomValueBoundary = 0;  //нижняя граница случайного значения
    int upperValueBoundary = 100; //верхняя граница случайного значения

    public static void main(String[] args) {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        int counter = 1;
        int sum = 0;
        for(int i = 0; i < 3; i++){
            int a =  randomGeneratorDemo.randomizer();
            System.out.println(counter + " случайное число = " + a);
            counter++;
            sum += a; //это тоже самое, но более краткое решение, чем - sum = sum + a;
        }
        System.out.println("Сумма 3 случайных чисел = " + sum);
    }
    public int randomizer(){
        int randomNumb = bottomValueBoundary + (int) (Math.random() * upperValueBoundary);
        return randomNumb;
    }
}
