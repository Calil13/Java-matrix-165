package lessonMentor14.Task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Test test = new Test();
        Method[] methods = test.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class) && Modifier.isPrivate(method.getModifiers())) {
                System.out.println("Method name: " +  method.getName());
                method.setAccessible(true);
                method.invoke(test);
            }
        }
    }
}
