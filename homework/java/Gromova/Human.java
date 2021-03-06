package Lessons;

public class Human {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }

}

class HumanDemo {
    public static void main(String[] args) {
        Human human = new Human("Ivan", 35);
        human.greet();
    }
}
