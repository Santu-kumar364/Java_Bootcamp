package Java_Bootcamp.DSA.Searching.BinarySearch;

public class Split_Array {

    public static void main(String[] args) {
        int nums[] = {7,2,5,10,8};
        int m = 2;
        int result = splitArray(nums, m);
        System.out.println(result);
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
         
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);  // in the end the loop will contain the max item of the array

            end += nums[i];
        }

        // apply Binary Search
        while(start < end) {
            int mid = start + (end - start) / 2;
 
            // calculate how many pieces you can divide this with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num 
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            
            if(pieces <= m) {
                end = mid;
            }
            else {
               start = mid + 1;
            }
        }
        return end;  // here start == end
    }
    
}













/*
 int[] arr = [7,2,5,10,8]

 case1: minimum partition we can make = 1
    [7,2,5,10,8]  == 32
    minimum sum = largest element in the array  (10)
    maximum sum = sum of all element of array   (32)

    Now the range is [10,32]

 case2: maximum partition we can make = n
   [7],[2],[5],[10],[8]  
 */