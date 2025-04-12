package lessonMentor4;

public class BinarySearch {
    //Binary Search

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] array = {1, 2, 5, 7, 8, 9, 11, 15};
        binarySearch.binarySearch(array, 12);
    }

    void binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num == arr[mid]) {
                System.out.println("The index of " + num + " is " + mid);
                break;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else if (num > arr[mid]) {
                start = mid + 1;
            }
        }
    }
}
