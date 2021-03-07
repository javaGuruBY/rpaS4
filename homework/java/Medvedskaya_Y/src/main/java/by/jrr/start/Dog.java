package by.jrr.start;

public class Dog {
    int age;
    String color;
    String name;

    Dog(int age, String color, String name)
    {
        this.age = age;
        this.color = color;
        this.name = name;
    }
    void voice()
    {
        System.out.println(name + " says: Hau Hau");
    }
    void eat()
    {
        System.out.println(name + " is eating");
    }
    void sleep()
    {
        System.out.println(name + " is sleeping");
    }
}
