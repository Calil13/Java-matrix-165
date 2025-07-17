package lessonMentor14.Task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RunMethod {
    void runMethod(Object object) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = object.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.getReturnType().equals(void.class) && Modifier.isPrivate(method.getModifiers())){
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }
}
