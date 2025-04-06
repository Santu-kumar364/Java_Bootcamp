package Java_Bootcamp.DSA.Searching.BinarySearch;

// public class Mountain {
//     public static void main(String[] args) {
//         int[] arr = {0,10,5,1};
//         int ans = peakIndexInMountainArray(arr);
//         System.out.println(ans);
//     }

//     static int peakIndexInMountainArray(int[] arr) {
//         int start = 0; 
//         int end = arr.length - 1;

//         while(start < end ) {
//             int mid = start + (end - start) / 2;
//             if(arr[mid] > arr[mid + 1]) {
//                 // you are in decreasing part of the array
//                 // this may be the answer, but look at left
//                 // this is why end != mid - 1
//                 end = mid;
//             }
//             else{
//                 // you are in asc part of array
//                 start = mid + 1; // because we know that mid+1 element > mid element
//             }
//         }
//         // at the end, start == end and pointing to the largest number because of the 2 above cases
//         // start and end are always trying to find max element in the above 2 checks
//         // hence, when they are pointing to just one element, that is the max element
//         // more elboration: at every point of time for start and end , they have the best possible answer till that time
//         // if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer

//         return start; // or return end both are equal
//     }
// }







public class Mountain {
    static  int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end-start) / 2;

            if( arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,13,2,1,0};
        int result = findPeak(arr);
        System.out.println("Peak value " + arr[result] + " found at index " + result);
        
    }
}










