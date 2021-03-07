package by.jrr.start;

public class Human {
    String name;
    int age;
    Human(String name, int age)
    {
        this.age=age;
        this.name=name;
    }
    void greet()
    {
        System.out.println("Hello! My name is " + name + ". I'm " + age + " years old)");
    }
}
