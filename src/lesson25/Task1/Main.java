package lesson25.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        students.add(new Students("Student1", 17, 82.5, 1));
        students.add(new Students("Student2", 20, 97.5, 3));
        students.add(new Students("Student3", 19, 70.7, 2));
        students.add(new Students("Student4", 20, 99.0, 3));
        students.add(new Students("Student5", 18, 88.3, 2));
        students.add(new Students("Student6", 21, 90.5, 4));
        students.add(new Students("Student7", 19, 91.8, 2));
        students.add(new Students("Student8", 18, 52.9, 1));

        List<Students> filtered = new ArrayList<>();
        for (Students s : students) {
            if (s.averageScore >= 90 && s.course > 2) {
                filtered.add(s);
            }
        }

        filtered.sort(Comparator
                .comparing((Students s) -> s.name)
                .thenComparingInt(s -> s.age));

        System.out.println("Eligible students");
        for (Students s : filtered) {
            System.out.println(s);
        }
    }
}
