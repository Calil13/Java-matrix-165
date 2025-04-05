package lessonMentor3;

import javax.sql.rowset.BaseRowSet;
import java.util.Arrays;

public class TaskHome10 {
    public static void main(String[] args) {
        /*
        Array-də qiyməti 2.5-dən böyük olmayan ilk elementini taparaq
        index-ni ve deyerini ekrana çıxarın. (double ola biler)
         */

        double[] array = {15, 3.2, 25, 1.8};

        for (int i = 0; i < array.length; i++){
            if (array[i] <= 2.5){
                System.out.println("Value : " + array[i]);
                System.out.println("Index : " + i);
                break;
            }
        }
    }
}
