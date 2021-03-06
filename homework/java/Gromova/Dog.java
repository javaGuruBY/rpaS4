package Lessons;

public class Dog {
    int age;
    String color;
    String name;

    public void voice(){
        System.out.println(name + " says gav-gav");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleaping");
    }
}

class DogDemo{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 5;
        dog.color = "brown";
        dog.name = "Baron";
        System.out.println("Dog with name " + dog.name + ", is "+ dog.age + " years old, color " + dog.color);
        dog.voice();
        dog.eat();
        dog.sleep();
    }
}
