package Java_Bootcamp.DSA.Searching.BinarySearch;

public class InfinityBinary {

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        // condition for the target is lie in the range
        while (target > arr[end]) {
            int temp = end + 1;
            // double the box value
            // end = privious end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return Search(arr, target, start, end);
    }

    static int Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 9, 10, 15, 25, 30,33};
        int target = 10;
        int result = ans(arr, target);

        if (result != -1) {
            System.out.println(target + " is found at " + result);
        } else {
            System.out.println("Not exists in the array");
        }
    }
}









