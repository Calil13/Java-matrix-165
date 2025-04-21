package lesson11;

public class ArrayTaskCall {
    public static void main(String[] args) {
        ArrayTask t = new ArrayTask();
        int result = t.arrays(new int[]{1, 2, 4}, new int[]{4, 5, 6});
        System.out.println(result);
    }
}
