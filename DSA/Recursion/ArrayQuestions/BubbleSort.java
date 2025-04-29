package Java_Bootcamp.DSA.Recursion.ArrayQuestions;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        Bubble_sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble_sort(int[] arr, int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }    
            Bubble_sort(arr, r, c+1);
        } else {
            Bubble_sort(arr, r-1, 0);
        }
    }
}



