package Java_Bootcamp.DSA.Sorting;
import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    // Swap nums[low] and nums[mid], increment both
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }

                case 1 -> // Just move mid
                    mid++;

                case 2 -> {
                    // Swap nums[mid] and nums[high], decrement high
                    swap(nums, mid, high);
                    high--;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j)  {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
