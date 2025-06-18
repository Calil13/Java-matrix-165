package lesson24;

import org.apache.poi.ss.formula.functions.T;

public class MyArrayList<T> implements MyList<T>{
    T[] array;
    int index;

    public MyArrayList() {
        array = (T[]) new Object[10];
        index = 0;
    }

    public void addValue(T value) {
        if (index == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index++] = value;
    }

    public void remove(int removeİndex){

    }

    public void get() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.print(array[i]);
            } else {
                break;
            }
        }
    }
}
