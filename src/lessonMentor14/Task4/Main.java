package lessonMentor14.Task4;

import java.lang.reflect.InvocationTargetException;

public class Main {
    //Her hansi sinifin return type- void olan her hansi private metodunu calisdiran metod

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        RunMethod run = new RunMethod();
        Class clazz = new Class();

        run.runMethod(clazz);
    }
}
