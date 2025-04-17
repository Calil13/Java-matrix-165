package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String text : ");
        String txt = scanner.nextLine();

        char[] txtCh = txt.toCharArray();

        for (int i = 0; i < txtCh.length; i++) {
            char temp = txtCh[i];
            for (int j = 0; j < txtCh.length; j++) {
//                if (txtCh[i] == txtCh[j]){
//                    String word;
//                    word = txtCh[j];
//                }
            }
        }
    }
}
