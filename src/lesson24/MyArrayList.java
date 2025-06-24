package lesson24;

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

    public void remove(int removeIndex){
        removeIndex -= 1;

        if (removeIndex < 0 || removeIndex >= index) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = removeIndex; i < index - 1; i++) {
            array[i] = array[i + 1];
        }

        array[index - 1] = null;
        index--;
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
