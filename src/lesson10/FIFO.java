package lesson10;

public class FIFO {
    int[] arr = new int[10];
    int index = 0;
    int temp = 0;

    void set(int num) {
        if (index < arr.length) {
            arr[index++] = num;
            System.out.println("Num is " + num);
        } else {
            System.out.println("Stack is full!");
        }
    }

    void get() {
        if (temp < index) {
            System.out.println("Popped: " + arr[temp++]);
        }else {
            System.out.println("Stack is empty!");
        }
    }
}
