package io.github.arabienko.Lecture3;

public class Dog {
    int age;
    String color;
    String name;
    private boolean dogOne;

    public void voice() {
        System.out.println("dog "+name+" age "+age+ " color "+color+" say HAU-HAU");

    }

    public void eat() {
        if (dogOne){
        System.out.println("dog "+name+" age "+age+ " color "+color+" want to eat");}
        else System.out.println("dog "+name+" age "+age+ " color "+color+" not hungry");
    }

    public void sleep() {
        System.out.println("dog "+name+" age "+age+ " color "+color+" want to sleep");
    }

    public void age(int age) {
        this.age=age;
    }

    public void color(String color) {
        this.color=color;
    }

    public void name(String name) {
        this.name=name;
    }
}
