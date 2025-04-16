package Java_Bootcamp.DSA.Recursion.ArrayQuestions;

public class RotationalSearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));  // Output should be 2
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Check if left part is sorted
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);  // Search in left half
            } else {
                return search(arr, target, m + 1, e);  // Search in right half
            }
        }
        // Right part is sorted
        else {
            if (target >= arr[m] && target <= arr[e]) {
                return search(arr, target, m + 1, e);  // Search in right half
            } else {
                return search(arr, target, s, m - 1);  // Search in left half
            }
        }
    }
}


