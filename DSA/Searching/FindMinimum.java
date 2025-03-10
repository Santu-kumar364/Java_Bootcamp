package Java_Bootcamp.DSA.Searching;

public class FindMinimum {
    static int find(int[] arr) {
        
      int minV = arr[0];
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] < minV) {
            minV = arr[i];
        }
      }

      return minV;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,3,4,2,19,7};
        int result = find(arr);
        System.out.println(result);
    }
}










