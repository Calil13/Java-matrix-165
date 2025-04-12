package lesson9;

public class PalindroemArr {

    boolean existPalindrome(int[] arr){
        int temp;
        int reversedNum;
        int copyNum;

        for (int i = 0; i < arr.length; i++) {
            reversedNum = 0;
            copyNum = arr[i];
            while (arr[i] > 0) {
                temp= arr[i] % 10;
                System.out.println(temp);
                arr[i] /= 10;
                reversedNum = reversedNum * 10 + temp;
            }
            if (copyNum == reversedNum){
                return true;
            }
        }
        return false;
    }
}
