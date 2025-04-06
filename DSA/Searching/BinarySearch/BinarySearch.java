package Java_Bootcamp.DSA.Searching.BinarySearch;

class BinarySearch {
    static int CheckBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,8,9,10,15,25,30};
        int target = 30;
        int result = CheckBinary(arr, target);

        if(result != -1) {
            System.out.println(target + " is found at " + result);
        }
        else {
            System.out.println("Not exists in the arra");
        }

    }
}



