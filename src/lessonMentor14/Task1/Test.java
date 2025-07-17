package lessonMentor14.Task1;

public class Test {
    private String name;
    private int age;

    @MyAnnotation
    private void test1(){
        System.out.println("Test1...");
    }

    private void test2(){
        System.out.println("Test2...");
    }

    @MyAnnotation
    public void test3(){
        System.out.println("Test3...");
    }
}

