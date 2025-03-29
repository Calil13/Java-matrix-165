package lesson5;

public class TaskHome2 {
    public static void main(String[] args) {
        //iki array var birinin ölçüsü digərindən 1 vahid çoxdur
        //(məs: birində 4 rəqəm varsa digərində 5 rəqəm var)
        //və bu arraylarin içərisindəki rəqəmlər eynidir, birindən başqa,
        //fərqli olan bu ədədi tapmalıyıq.

        int[] arr1 = {1,2,3,5};
        int[] arr2 = {1,3,5};
        boolean found;

        for (int array1 : arr1){
            found = false;
            for (int array2 : arr2){
                if (array1 == array2){
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Different number is " + array1);
            }
        }
    }
}
