package lesson22.SingletonPattern;

public class Singleton {
    public static Singleton singleton;

    private Singleton() {}

    public synchronized static Singleton getSingleton() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void message(){
        System.out.println("Singleton!");
    }
}
