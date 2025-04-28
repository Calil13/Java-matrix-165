package lesson13;

public class Cat extends Animal {
    void meow(){
        System.out.println("Meow");
    }

    Cat(int age, int legs){
        super(age, legs);
    }
}
