package io.github.arabienko.syntax;

public class App {
    public static void main(String[] args) {

        int varInt = 11;
        Double varDab = 22.0;

        System.out.println("Hellp world!");
        Dog yangDog = new Dog(6, 10.25);
        Dog oldDog = new Dog(12, 500.2);
        yangDog.name = "Cheshka";
        oldDog.name = "Totoshka";

        //System.out.println(yangDog.toString());
        System.out.println(yangDog);
        //System.out.println(oldDog.toString());
        System.out.println(oldDog);



    }
}
