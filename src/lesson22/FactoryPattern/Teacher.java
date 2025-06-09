package lesson22.FactoryPattern;

public class Teacher implements School {

    @Override
    public void lesson() {
        System.out.println("I teach a lesson!");
    }
}
