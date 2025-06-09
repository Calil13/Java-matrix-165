package lesson22.FactoryPattern;

public class Student implements School {

    @Override
    public void lesson() {
        System.out.println("I'm learning a lesson!");
    }
}
