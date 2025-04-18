package Java_Bootcamp.DSA.Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 2, 11, 0, 21, 35, 17};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            // Move s forward if current element is less than pivot
            while (arr[s] < pivot) {
                s++;
            }
            // Move e backward if current element is greater than pivot
            while (arr[e] > pivot) {
                e--;
            }
            // Swap values if needed
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Recursively sort the two halves
        sort(arr, low, e);
        sort(arr, s, high);
    }
}




