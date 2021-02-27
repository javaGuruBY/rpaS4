package io.github.arabienko.syntax;

public class Dog {
    int age;
    Double price;
    String name;

public Dog (int a, double b){
    this.age=a;
    this.price=b;
    /*System.out.println("Dog Has Been Created");
    String state=this.toString();
    System.out.println(state);*/
    //System.out.println(age);
    //System.out.println(price);
    //bark();
    }
    public void bark(){
        System.out.println("dog say");
        System.out.println("hay hay");
    }

    /*@Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }*/
}
