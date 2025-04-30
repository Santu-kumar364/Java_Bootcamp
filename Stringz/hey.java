package Java_Bootcamp.Stringz;
// import java.util.Arrays;
//     public static void main(String[] args) {

import java.util.Arrays;

//         int[] arr = {1,4,5,8,6,9,11,21,3};
//         mergeSort(arr, 0, arr.length);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void mergeSort(int[] arr, int start, int end) {
//         if(end - start == 1) return;
//         int mid = start + (end - start) / 2;
//         mergeSort(arr, start, mid);
//         mergeSort(arr, mid, end);
//         merge(arr, start, mid, end);
//     } 
//     static void merge(int[] arr, int start, int mid, int end) {
//         int[] mix = new int[end - start];
//         int i = start;
//         int j = mid;
//         int k = 0;
//         while(i < mid && j < end){
//             if(arr[i] < arr[j]) {
//                 mix[k] = arr[i];
//                 i++;
//             }
//             else{
//                 mix[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i < mid) {
//             mix[k] = arr[i];
//             i++;
//             k++;
//         }
//         while(j < end) {
//             mix[k] = arr[j];
//             j++;
//             k++;
//         }
//         for(int l = 0; l < mix.length; l++) {
//             arr[start + l] = mix[l];
//         }
//     }
// }
// class dialPad {
//     public static void main(String[] args) {
//        System.out.println(pad( "", "23"));
//     }
//     static ArrayList<String> pad(String p, String up) {
//         if(up.isEmpty()) {
//              ArrayList<String> list = new ArrayList<>();
//              list.add(p);
//              return list;
//         }
//         int digit = up.charAt(0) - '0';
//         String letters = getLetters(digit);
//         ArrayList<String> ans = new ArrayList<>();
//         for(int i = 0; i < letters.length(); i++) {
//             char ch = letters.charAt(i);
//             ans.addAll(pad(p + ch, up.substring(1)));
//         }
//         return ans;
//     }
//     static String getLetters(int digits) {
//         return switch(digits) {
//             case 2 -> "abc";
//             case 3 -> "def";
//             case 4 -> "ghi";
//             case 5 -> "jkl";
//             case 6 -> "mno";
//             case 7 -> "pqrs";
//             case 8 -> "tuv";
//             case 9 -> "wxyz";
//             default -> "";
//         };
//     }
// }

class hey {
    public static void main(String[] args) {
        int[] arr = {1, 2, 15, 6, 10, 45, 23, 12, 11};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if(low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr, low, end);
        sort(arr, start, high);
        
    }
}
