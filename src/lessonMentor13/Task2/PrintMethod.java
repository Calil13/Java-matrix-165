package lessonMentor13.Task2;

import java.lang.reflect.Method;

public class PrintMethod {
    public void printSetMethod(Object obj) {
        Method[] mSet = obj.getClass().getDeclaredMethods();
        System.out.println("Set : ");
        for (Method method : mSet) {
            if (method.getName().startsWith("set") && method.getReturnType().equals(void.class)) {
                System.out.println(method.getName());
            }
        }
    }

    public void printGetMethod(Object obj) {
        Method[] mGet = obj.getClass().getDeclaredMethods();
        System.out.println("Get : ");
        for (Method method : mGet) {
            if (method.getName().startsWith("get")) {
                System.out.println(method.getName());
            }
        }
    }
}