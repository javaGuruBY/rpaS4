package io.github.arabienko.Lecture3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.setAge(12);
        dogOne.setColor("brown");
        dogOne.setName("Barsik");

        dogOne.voice();
        dogOne.sleep();
        dogOne.eat();

        Dog dogTwo = new Dog();
        dogTwo.setAge(5);
        dogTwo.setColor("white");
        dogTwo.setName("Bobik");
        System.out.println();
        dogTwo.voice();
        dogTwo.sleep();
        dogTwo.eat();
        System.out.println();
        System.out.println(dogOne.toString());
        System.out.println(dogTwo.toString());


    }
}
