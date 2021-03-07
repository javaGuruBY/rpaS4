package by.jrr.start;

public class Dog {

    private double age;
    private String color;
    private String name;

    public Dog(double age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        if (age < 1) {
            System.out.println("Tjaf tjaf");
        } else {
            System.out.println("Gav gav");
        }
    }

    public void eat() {
        System.out.println("Om nom nom");
    }

    public void sleep() {
        System.out.println("Zzzzz");
    }
}
