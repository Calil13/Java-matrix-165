package lessonMentor15.Task1;

import java.lang.reflect.Field;
import java.util.List;

public class StatAnalyzer {
    public static void analyze(List<?> list) throws IllegalAccessException {
        double avg = 0;
        int count = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (Object obj : list) {
            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);

                if (field.isAnnotationPresent(StatField.class)) {
                    Object value1 = field.get(obj);

                    if (value1 instanceof Number num) {
                        count++;
                        double value2 = num.doubleValue();

                        avg += value2;

                        if (value2 < min) {
                            min = value2;
                        }

                        if (value2 > max) {
                            max = value2;
                        }
                    }
                }
            }
        }

        System.out.println("Average : " + avg / count +
                            "\nMin : " + min +
                            "\nMax : " + max);

    }
}
