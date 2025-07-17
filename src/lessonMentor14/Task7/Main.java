package lessonMentor14.Task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Listde olan tekrarlanan Stringleri bashqa collectiona yigmaq

        List<String> lists = Arrays.asList("string1", "string2", "string3", "string1", "string2");

        Set<String> add = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String list : lists) {
            if (!add.add(list)) {
                duplicate.add(list);
            }
        }

        System.out.println("Duplicate : " + duplicate);
    }
}
