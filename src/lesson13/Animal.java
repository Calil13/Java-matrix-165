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

    void string() {
        System.out.println("Name : " + name +
                "\nAge : " + age +
                "\nLegs : " + legs);
    }

//    boolean equals(String name, int age) {
//
//    }
}
