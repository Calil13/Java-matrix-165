package lesson13;

public class Dog extends Animal {
    void bark(){
        System.out.println("Bark");
    }

    Dog(int age, int legs){
        super(age, legs);
    }
}
