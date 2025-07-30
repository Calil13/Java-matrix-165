package lessonMentor15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> usersList = new ArrayList<>();

        User user1 = new User("user1", "use1@gmail.com", 19);
        User user2 = new User("user2", "user2@gmail.com", 22);
        User user3 = new User("user3", "user3@gmail.com", 17);

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);

//        try {
//            ObjectValidator.validate(user1);
//            System.out.println("user is valid!");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            StatAnalyzer.analyze(usersList);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
