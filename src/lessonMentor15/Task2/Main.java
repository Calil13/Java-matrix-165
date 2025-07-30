package lessonMentor15.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<User> users = List.of(
                    new User("User1", "user1@gmail.com", 19),
                    new User("User2", "user2@gmail.com", 21),
                    new User("User3", "user3@gmail.com", 24)
            );

            ExcelExporter.exportToExcel(users, "users.xlsx");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
