package lessonMentor3;

public class Task3 {
    public static void main(String[] args) {

        //arraydeki elementlerin ortalamasini tapmaq.

        int[] arr = {1, 4, 3, 5, 7, 10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        System.out.println("Average is : " + average);
    }
}
