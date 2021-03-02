package homework.java.PilipenkoAlex.lecture.lecture2;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 4; i++){
            int a = randomizer();
            System.out.println(i + " случайное число = " + a);
            sum += a;
        }
        System.out.println("Сумма 3 случайных чисел = " + sum);
    }
    public static int randomizer(){
        int bottomValueBoundary = 0;  //нижняя граница случайного значения
        int upperValueBoundary = 100; //верхняя граница случайного значения
        int randomNumb = bottomValueBoundary + (int) (Math.random() * upperValueBoundary);
        return randomNumb;
    }
}
