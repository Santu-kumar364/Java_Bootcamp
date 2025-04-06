package Java_Bootcamp.patterns;

/*public class RightSkewedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        

    }
    
}*/


class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposeMatrix = new int[col][row];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                transposeMatrix[j][i] = matrix[i][j]; 
            }
        }
        return transposeMatrix;
        
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Solution obj = new Solution();

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] mat2 = {
            {1,2,3},
            {4,5,6}
        };

        System.out.println("Transpose of mat:");
        printMatrix(obj.transpose(mat));

        System.out.println("\nTranspose of mat2:");
        printMatrix(obj.transpose(mat2));
 

    }

}