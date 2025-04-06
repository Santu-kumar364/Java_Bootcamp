package Java_Bootcamp.DSA.Searching.BinarySearch;

public class SearchInMountain {

    public static void main(String[] args) {
        // int[] arr = {1,3,4,9,4,3,0};
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        int result = ans(arr, target);
        System.out.println(result);
    }

    static int ans(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return OrderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0; 
        int end = arr.length - 1;

        while(start < end ) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of the array
                // this may be the answer, but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else{
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // at the end, start == end and pointing to the largest number because of the 2 above cases
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max element
        // more elboration: at every point of time for start and end , they have the best possible answer till that time
        // if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer

        return start; // or return end both are equal
    }

 

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
 
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
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return - 1;
    }
}





