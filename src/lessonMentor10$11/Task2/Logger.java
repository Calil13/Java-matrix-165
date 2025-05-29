package lessonMentor10$11.Task2;

import java.time.LocalDateTime;

public class Logger {
    private static String mesasage;

    public static void info(Device device, String message){
        System.out.println("[" + LocalDateTime.now() + "] [INFO] " + device + message);
    }

    public static void error(Device device){
        System.out.println("[" + LocalDateTime.now() + "] [ERROR] " + device);
    }

    public static void success (Device device, String message){
        System.out.println("[" + LocalDateTime.now() + "] [SUCCESS] " + device + message);
    }
}