package Java_Bootcamp.DSA.Recursion; 

public class Recursive_Binary {
    public static void main(String[] args) {
         int[] arr = {1,3,4,8,9,10,15};
         int target = 8;
         int start = 0;
         int end = arr.length - 1;
         
         int res = sort(arr, target, start, end);
         System.out.println(res);
    }

    static  int sort(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(mid < target) {
                return sort(arr, target, mid+1, arr.length - 1);
            }
            else{
                return sort(arr, target, 0, mid - 1);
            }
        }
        return -1;
    }
}


