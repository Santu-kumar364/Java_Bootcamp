package Java_Bootcamp.DSA.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] arr = {4,0,8,9,1,11};
        sort(arr);

        for(int a : arr) {
            System.out.print(a + " ");
        }
        //System.out.println(Arrays.toString(arr));   
    }

    static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n -1; i ++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }
    
}
