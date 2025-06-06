package Java_Bootcamp.DSA.Searching.BinarySearch;
import java.util.Arrays;

public class Search2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30,40},
            {15, 25, 35,45},
            {28, 29, 37,49},
            {33, 34, 36,50}
        };
        int target = 37;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int colum = arr.length - 1;

        while (row < arr.length && colum >= 0) { 
            if(arr[row][colum] == target) {
                return new int[]{row, colum};
            }
            if(arr[row][colum] < target) {
                row++;
            }
            else {
                colum--;
            }
        }
 
        return new int[]{-1,-1};
    }
}    



