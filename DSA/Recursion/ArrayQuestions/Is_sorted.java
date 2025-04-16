package Java_Bootcamp.DSA.Recursion.ArrayQuestions;

public class Is_sorted {
    public static void main(String[] args) {
        // int[] arr = {4, 1, 5, 89, 3, 19, 21, 11};
        int[] arr = {1,2,5,8,9,11};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int i) {
        if(i == arr.length - 1) {
            return true;
        }

        if(arr[i] > arr[i +1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }
} 



