package lesson4;

public class NestedFor {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                count++;
            }
        }
        System.out.println(count);
    }
}
