package lessonMentor14.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //Listdeki elementleri siralayan metod(stream ile)

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(34);
        list.add(100);
        list.add(8);
        list.add(18);

        List<Integer> sortedList = list.stream()
                .sorted()
                .toList();

        System.out.println("Sorted list - " + sortedList);
    }
}
