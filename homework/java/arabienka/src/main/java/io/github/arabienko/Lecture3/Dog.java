package io.github.arabienko.Lecture3;

public class Dog {
    private int age;
    private String color;
    private String name;


    public void voice() {
        System.out.println("dog " + name + " age " + age + " color " + color + " say HAU-HAU");

    }

    public void eat() {
        if (name == "Barsik") {
            System.out.println("dog " + name + " age " + age + " color " + color + " want to eat");
        } else System.out.println("dog " + name + " age " + age + " color " + color + " not hungry");
    }

    public void sleep() {
        System.out.println("dog " + name + " age " + age + " color " + color + " want to sleep");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
