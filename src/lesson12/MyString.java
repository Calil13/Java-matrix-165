package lesson12;

public class MyString {
    char[] ch;

    static String strReverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    MyString(String str) {
        this.ch = str.toCharArray();
    }

    void printChar() {
        for (char ch : ch) {
            System.out.print(ch + " ");
        }
    }
}
