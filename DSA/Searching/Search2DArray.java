package Java_Bootcamp.DSA.Searching;

import java.util.Arrays;

public class Search2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {5,1,13},
            {17,12,8,4},
            {2,9,11,3},
            {18,7}
        };

        int target = 7;

        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static  int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                    
                }
            }
        }
        return new int[]{-1,-1};
    }
}
