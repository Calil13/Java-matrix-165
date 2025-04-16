package Tasks;

public class Task2 {
    int arrays(int[] array1, int[] array2){
        //Input: l1 = [2,4,3], l2 = [5,6,4]
        //Output: [7,0,8]
        //Explanation: 342 + 465 = 807.

        int arrNum1 = 0;
        int arrNum2 = 0;

        for (int i = array1.length - 1; i >= 0; i--) {
            arrNum1 = arrNum1 * 10 + array1[i];
        }

        for (int j = array2.length - 1; j >= 0; j--) {
            arrNum2 = arrNum2 * 10 + array2[j];
        }
        return arrNum1 + arrNum2;
    }

    public static void main(String[] args) {
        Task2 t = new Task2();
        int result = t.arrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(result);
    }
}
