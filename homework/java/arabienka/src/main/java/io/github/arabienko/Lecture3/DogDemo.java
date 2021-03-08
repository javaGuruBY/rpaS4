package io.github.arabienko.Lecture3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.age(12);
        dogOne.color("brown");
        dogOne.name("Barsik");

        dogOne.voice();
        dogOne.sleep();
        dogOne.eat();

        Dog dogTwo = new Dog();
        dogTwo.age(5);
        dogTwo.color("white");
        dogTwo.name("Bobik");

        dogTwo.voice();
        dogTwo.sleep();
        dogTwo.eat();


    }
}
