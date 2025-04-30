package Java_Bootcamp.DSA.Recursion.Backtracking;
import java.util.Arrays;

public class Backtracking2 {
    public static void main(String[] args) {
        boolean[][] mazes = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int[][] path = new int[mazes.length][mazes[0].length];
        allPathPrint("", mazes, 0, 0, path, 1);
    }

    static void allPathPrint(String p, boolean[][] mazes, int r, int c, int[][] path, int step) {
        if (r == mazes.length - 1 && c == mazes[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
              System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!mazes[r][c]) {
            return;
        }

        // i am considering this block in my path
        mazes[r][c] = false;
        path[r][c] = step;

        // go Vertical/Down
        if (r < mazes.length - 1) {
            allPathPrint(p + 'V', mazes, r + 1, c, path, step+1);
        }
        // go Horizontal/Right
        if (c < mazes[0].length - 1) {
            allPathPrint(p + 'H', mazes, r, c + 1, path, step+1);
        }
        // move Up 
        if (r > 0) {
            allPathPrint(p + 'U', mazes, r - 1, c, path, step+1);
        }
        // move Left
        if (c > 0) {
            allPathPrint(p + 'L', mazes, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removal, also remove the changes that were made by that function 
        mazes[r][c] = true;
        path[r][c] = 0;
    }
}








