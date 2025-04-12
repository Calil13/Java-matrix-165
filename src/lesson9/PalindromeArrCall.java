package lesson9;

public class PalindromeArrCall {
    public static void main(String[] args) {
        //class yarat içərisində metod olsun və
        //arrayı içərisində palindrom ədəd varsa true, yoxs false qaytarsın

        int[] arr = {123,64,12324,66};
        PalindroemArr palindroemArr = new PalindroemArr();
        boolean check = palindroemArr.existPalindrome(arr);
        System.out.println(check);
    }
}
