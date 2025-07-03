package lessonMentor14.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TaskMethod {

    private Method method;

    public void method(Object object, String str) {
        Field[] fields = object.getClass().getDeclaredFields();
    }
}
