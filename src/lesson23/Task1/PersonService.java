package lesson23.Task1;

import java.lang.reflect.Field;

public class PersonService {
    public void check(Field[] field, int age) {

        for (int i = 0; i < field.length; i++) {
            Max max = field[i].getAnnotation(Max.class);
            Min min = field[i].getAnnotation(Min.class);

            if (min != null) {
                if (age < min.value()) {
                    throw new RuntimeException("This age is less than " + min.value() + " years old!");
                }
            }

            if (max != null) {
                if (age > max.value()){
                    throw new RuntimeException("This age is over " + max.value() + " years old!");
                }
            }
        }
    }
}
