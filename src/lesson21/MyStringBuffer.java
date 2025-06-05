package lesson21;

public class MyStringBuffer {
    String string;
    private char[] buffer;

    public MyStringBuffer(String string) {
        this.string = string;
        buffer = new char[100];
    }

    public void append(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == 100){

            }
        }
    }
}
