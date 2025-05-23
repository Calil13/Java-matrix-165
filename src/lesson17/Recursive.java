package lesson17;

public class Recursive {
    public static int sum(int[] arr, int index) {
        if (index < 0){
            return 0;
        }

        return arr[index] + sum(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(sum(nums, nums.length - 1));
    }
}
