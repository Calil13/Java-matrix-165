package lessonMentor14.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Listdeki elementleri filter edin (ex: num > 5)

        List<Integer> list = new LinkedList<>();

        list.add(130);
        list.add(15);
        list.add(10);
        list.add(30);
        list.add(1);
        list.add(8);
        list.add(12);

        List<Integer> filter = list.stream().
                filter(num -> num > 10).
                toList();

        System.out.println("Numbers greater than 10 - " + filter);
    }
}
