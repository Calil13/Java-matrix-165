package lessonMentor14.Task8;

import java.util.Arrays;

public class Main {
    public static void listMethodsAndParameters(Class<?> clazz) {
        Arrays.stream(clazz.getDeclaredMethods())
                .forEach(method -> {
                    String methodName = method.getName();
                    int parametersMethod = method.getParameterCount();

                    System.out.println("Metod: " + methodName + ", Parametr sayı: " + parametersMethod);
                });
    }

    public static void main(String[] args) {
        listMethodsAndParameters(Test.class);
    }
}
