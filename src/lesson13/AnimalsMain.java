package lesson13;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Y",3,4);
        Cat cat = new Cat("Y",3,4);
        System.out.println("Dog...");
        dog.string();
        System.out.println("--------");
        System.out.println("Cat...");
        System.out.println(cat);

        dog.equals(cat);
    }
}
