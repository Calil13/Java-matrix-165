package lesson13;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Y",3,4);
        Dog dog1 = new Dog("Y",3,4);
        Cat cat = new Cat("X",3,4);
        Cat cat1 = new Cat("X",3,4);
        System.out.println("Dog...");
        System.out.println(dog.toString());
        System.out.println("--------");
        System.out.println("Cat...");
        System.out.println(cat.toString());

        System.out.println(dog.equals(dog1));
        System.out.println(cat.equals(cat1));
    }
}
