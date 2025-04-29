package lesson13;

public class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }

    Cat(String name, int age, int legs) {
        super(name, age, legs);
    }
}
