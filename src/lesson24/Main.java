package lesson24;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> text = new MyArrayList<>();
        text.addValue("Calil");
        text.addValue(" Ahmadov");
        text.get();
        System.out.println();

        text.remove(3);
        text.get();
    }
}
