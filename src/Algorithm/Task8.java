package Algorithm;

public class Task8 {
    public static int deger1 = 5;
    public int deger2 = 10;

    public static void main(String[] args) {
        Task8 d1 = new Task8();
        Task8 d2 = new Task8();

        d1.deger1 = 4;
        d2.deger1 = 7;
        d1.deger2 = 12;
        d2.deger2 = 5;

        System.out.println(d1.deger1);
        System.out.println(d2.deger1);
        System.out.println(d1.deger2);
        System.out.println(d2.deger2);
    }
}
