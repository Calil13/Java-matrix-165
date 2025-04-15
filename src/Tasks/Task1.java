package Tasks;

import java.util.Arrays;

public class Task1 {
    //Arrayin içindən elə iki rəqəm seçki onları cəmlədikdə
    //sənin qoyduğun hədəfi versin.
    //və sonda onların indexsini ekrana yazdır
    //məs: {3, 8, 2, 12, 7}, hədəf : 9
    //output : [2, 4]

    int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index1 = i;
                    index2 = j;
                    return new int[]{index1, index2};
                }
            }
        }
        System.out.println("Indexs : " + index1 + "," + index2);
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Task1 tester = new Task1();
        int[] result = tester.twoSum(new int[]{3, 8, 2, 12, 7}, 23);

        System.out.println(Arrays.toString(result));
    }
}
