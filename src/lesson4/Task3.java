package lesson4;

public class Task3 {
    public static void main(String[] args) {

        // 100 ə qədər sadə ədədləri tap
        boolean isPrime;
        for (int i = 2; i <= 100; i++) {
            isPrime = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println(i);
            }
        }
    }
}
