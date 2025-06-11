package Java_Bootcamp.DSA.Sorting;
import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];  // Current element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j--;
            }
            arr[j + 1] = current;  // Insert key at the correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}











