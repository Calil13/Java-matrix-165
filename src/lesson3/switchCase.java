package lesson3;

public class switchCase {
    public static void main(String[] args) {

        int a = 4;

        switch (a) {
            case 4:
                System.out.println("a == 4");
                break;
            case 3:
                System.out.println("a == 3");
                break;
            case 5:
                System.out.println("a == 5");
                break;
            default:
                System.out.println("Default");
        }
    }
}
