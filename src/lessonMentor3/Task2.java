package lessonMentor3;

public class Task2 {
    public static void main(String[] args) {
       /*
       iki tekrarlanmayan sirali elementli arrayler arasinda ortaq elementleri cixisa vermek.
       array1: 1 3 4 9 15
       array2: 2 3 5 9 14
       output: 3 9
        */

        int[] arr1 = {1, 4, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 1};
        boolean found;

        for (int array1 : arr1){
            found = false;
            for (int array2 : arr2){
                if (array1 == array2){
                    found = true;
                    break;
                }
            }
            if (found){
                System.out.println("Same number is " + array1);
            }
        }
    }
}
