package Java_Bootcamp.DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 0, 8, 9, 1, 11};
        sort(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));  
    }

    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j;
                }
            }
            // Swap the smallest element with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}








