package lessonMentor14.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TaskMethod {
    public void changeField(Object object, String filedName, Object newValue) {
        try {
            Class<?> clazz = object.getClass();
            Field field = clazz.getDeclaredField(filedName);
            field.setAccessible(true);

            field.set(object, newValue);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
