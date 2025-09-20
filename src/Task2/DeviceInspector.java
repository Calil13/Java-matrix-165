package Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DeviceInspector {

    public static void inspect(Object obj) {
        Class<?> clazz = obj.getClass();

        System.out.println("Class name: " + clazz.getSimpleName());

        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(" - " + field.getName() + "(" + field.getType().getName() + ")");
            try {
                Object value = field.get(obj);

                if (value instanceof Enum<?>) {
                    Enum<?> enumValue = (Enum<?>) value;
                    System.out.println("    Enum value:  " + enumValue.name());

                    try {
                        Field descField = enumValue.getClass().getDeclaredField("description");
                        descField.setAccessible(true);
                        String description = (String) descField.get(enumValue);
                        System.out.println("    Description: " + description);
                    } catch (NoSuchFieldException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Methods:");
        for (Method method : clazz.getMethods()) {
            System.out.println(" - " + method.getName());
        }

        System.out.println("------------------------------------------------");
    }
}
