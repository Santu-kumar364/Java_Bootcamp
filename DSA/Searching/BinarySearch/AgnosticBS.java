package Java_Bootcamp.DSA.Searching.BinarySearch;

public class AgnosticBS {
    static int search(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            boolean isAsc = arr[start] < arr[start + 1];
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] == target) {
                    return mid;
                }
                if(isAsc) {
                    if(target > arr[mid]) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
                else {
                    if(arr[mid] > target) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
            }
            return - 1;
        }
        public static void main(String[] args) {
            int[] arr = {-5,-2,0,3,5,7,11,19,25};
            // int[] arr = { 25, 19, 13, 7, 3, 0, -7, -9, -11 };
            int target = 7;
            int result = search(arr, target);
        if (result != -1) {
            System.out.println(target + " is found at index: " + result);
        } else {
            System.out.println("Not exists in the array");
        }
    }
}
 