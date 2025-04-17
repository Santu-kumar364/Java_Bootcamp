package Java_Bootcamp.DSA.Sorting;
import java.util.Arrays;

// public class MergeSort {
//     public static void main(String[] args) {
//         int[] arr = {1,4,8,3,7,2,9};
//         arr = merge_sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static int[] merge_sort(int[] arr) {
//         if(arr.length == 1) return arr;

//         int mid = arr.length / 2;

//         int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));

//         return merge(left, right);
//     }

//     static int[] merge(int[] first, int[] second) {
//         int[] mix = new int[first.length + second.length];

//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while(i < first.length && j < second.length) {
//             if(first[i] < second[j]) {
//                 mix[k] = first[i];
//                 i++;
//             } else {
//                 mix[k] = second[j];
//                 j++;
//             }
//             k++;
//         }
        
//         // It may be possible that one of the array is not complete
//         while(i < first.length) {
//             mix[k] = first[i];
//             i++;
//             k++;
//         }
//         while(j < second.length) {
//             mix[k] = second[j];
//             j++;
//             k++;
//         }  

//         return mix;
//     }
// }





public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,4,8,3,7,2,9};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInplace(int[] arr, int s, int e) {
        if(e - s == 1) return;

        int mid = s + (e - s) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // It may be possible that one of the array is not complete
        while(i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }  

        for(int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
          
    }
}









