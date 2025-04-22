package lesson10;

public class FILO {
    int[] arr = new int[10];
    int index = 0;

    void set(int num) {
        if (index < arr.length) {
            arr[index++] = num;
            System.out.println("Num is " + num);
        } else {
            System.out.println("Stack is full!");
        }
    }

    int get() {
        if (index > 0) {
            int value = arr[--index];
            System.out.println("Value : " + value);
            return value;
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
}
