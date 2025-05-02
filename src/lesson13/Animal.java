package lesson13;

public class Animal {
    String name;
    int age;
    int legs;

    Animal(String name, int age, int legs) {
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    public String toString() {
        return "Name : " + name +
                "\nAge : " + age +
                "\nLegs : " + legs;
    }
}