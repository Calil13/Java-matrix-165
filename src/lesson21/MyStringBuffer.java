package lesson21;

public class MyStringBuffer {
    private char[] buffer;
    int length;

    public MyStringBuffer(String string) {
        buffer = new char[string.length() + 10];
        for (int i = 0; i < string.length(); i++) {
            buffer[i] = string.charAt(i);
        }
        length = string.length();
    }

    public synchronized void append(String str) {
        if (length + str.length() > buffer.length) {
            char[] newBuffer = new char[length + str.length() * 2];

            for (int i = 0; i < length; i++) {
                newBuffer[i] = buffer[i];
            }
            buffer = newBuffer;
        }

        for (int i = 0; i < str.length(); i++) {
            buffer[length++] = str.charAt(i);
        }
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < length; i++) {
            result += buffer[i];
        }
        return result;
    }
}
