package lessonMentor14.Task6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Iki listi birlesdirin

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6,7);

        List<Integer> list12 = Stream.concat(list1.stream(), list2.stream()).toList();

        System.out.println(list12);
    }
}
