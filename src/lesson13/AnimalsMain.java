package lesson13;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog(3,4);
        System.out.println("Age : " + dog.age);
        dog.bark();
        Cat cat = new Cat(2,4);
        System.out.println("Age : " + cat.age);
        cat.meow();
    }
}
