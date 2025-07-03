package lesson24;

import org.apache.poi.ss.formula.functions.T;

public interface MyList<T> {
    void remove(int index);
    void addValue(T value);
    void get();
    //int size();
}
