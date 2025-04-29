package lesson13;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog("X",3,4);
        Cat cat = new Cat("Y",2,4);
        System.out.println("Dog...");
        dog.string();
        System.out.println("--------");
        System.out.println("Cat...");
        cat.string();

        //dog.equals();
    }
}
