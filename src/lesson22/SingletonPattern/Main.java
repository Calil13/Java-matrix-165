package lesson22.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getSingleton();
        obj.message();
    }
}
