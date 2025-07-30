package lessonMentor15.Task1;

import java.lang.reflect.Field;

public class ObjectValidator {
    public static void  validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            try {
                Object value = field.get(obj);

                if (field.isAnnotationPresent(NotNull.class)) {
                    if (value == null) {
                        throw new ValidationException("value is null!");
                    }
                }

                if (field.isAnnotationPresent(Length.class)) {
                    if (value != null) {
                        var annotationField = field.getAnnotation(Length.class);
                        int length = ((String) value).length();
                        if (length < annotationField.min() || length > annotationField.max()) {
                            throw new ValidationException("email length is incorrect!");
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
