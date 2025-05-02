package lesson13;

public class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }

    Cat(String name, int age, int legs) {
        super(name, age, legs);
    }

    boolean equals(Cat cat) {
        if (cat.name == this.name && cat.age == this.age) {
            return true;
        }
        return false;
    }
}

