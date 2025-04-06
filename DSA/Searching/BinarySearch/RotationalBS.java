package Java_Bootcamp.DSA.Searching.BinarySearch;

public class RotationalBS {
    public static void main(String[] args) {
        // int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {2, 2, 2, 3, 4, 2, 2};

        int target = 2;  // Target to find
        int result = search(arr, target);

        System.out.println("Pivot Index: " + findPivot(arr));
        System.out.println("Target found at index: " + result);
    }

    static int search(int[] arr, int target) {
        // int pivot = findPivot(arr);
        int pivot = findPivotWithDuplicate(arr);


        // If no pivot is found, array is not rotated -> Perform normal binary search
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If pivot is the target
        if (arr[pivot] == target) {
            return pivot;
        }

        // Decide which part to search
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Found the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 2: Move left if the start element is greater than mid (pivot is on left side)
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicate(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Found the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
 
            // if element at start, middle, end are equal then just skip duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                // NOTE: what if these elements at start and end were pivot
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check weather end is pivot
                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            }  
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}







