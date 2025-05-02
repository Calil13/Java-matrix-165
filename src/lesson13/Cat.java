package lesson13;

public class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }

    Cat(String name, int age, int legs) {
        super(name, age, legs);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            if (cat.name == this.name && cat.age == this.age) {
                return true;
            }
        }
        return false;
    }
}

