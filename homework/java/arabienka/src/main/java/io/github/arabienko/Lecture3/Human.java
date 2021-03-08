package io.github.arabienko.Lecture3;

public class Human {

    String name;
    int age;

public Human (String name,int age){
    this.age=age;
    this.name=name;
}


    public void greet() {
        System.out.println("Hi! My name is "+name+", I'm "+age+" years old");
    }
}
