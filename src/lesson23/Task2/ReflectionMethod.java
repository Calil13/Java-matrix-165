package lesson23.Task2;

import java.lang.reflect.Field;

public class ReflectionMethod {
    public void setField(Object obj, String name, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = obj.getClass().getDeclaredField(name);
        field.setAccessible(true);
        field.set(obj, value);
    }
}
