package Java_Bootcamp.DSA.Searching.BinarySearch;

 // Ceiling of a number X in a sorted array is the smallest element ≥ X.

class Ceiling {
    static int Check(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]) {
            return -1;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,9,10,15,25,30};
        int target = 8;
        int result = Check(arr, target);

        if (result != -1) {
            System.out.println("Ceiling of " + target + " is at index " + result + " with value " + arr[result]);
        } else {
            System.out.println("Ceiling does not exist in the array.");
        }
    }
}







