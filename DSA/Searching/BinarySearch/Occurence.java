package Java_Bootcamp.DSA.Searching.BinarySearch;
import java.util.Arrays;

class Occurence {

    static int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }

    static int binarySearch(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                index = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 9, 15, 25, 30};
        int target = 4;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
