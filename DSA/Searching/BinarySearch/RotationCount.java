package Java_Bootcamp.DSA.Searching.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
        
    }

    static int  countRotations(int[] arr) { 
        int pivot = findPivot(arr);
        // int pivot = findPivotWithDuplicate(arr)
        return  pivot + 1;
    }

    // use this for non-duplicate
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

    // use this for duplicate
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
    
}
