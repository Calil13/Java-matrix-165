package lesson5;

public class Arrays {
    public static void main(String[] args) {
        //factorial hesablama 1-50 arası

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++){
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(factorial);
        }
    }
}
