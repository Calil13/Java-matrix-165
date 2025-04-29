package lesson13;

public class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }

    Dog(String name, int age, int legs) {
        super(name, age, legs);
    }
}
