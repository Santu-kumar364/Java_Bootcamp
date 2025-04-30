package Java_Bootcamp.DSA.Recursion.Backtracking;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] mazes = {
            {true, true, true},
            {true, true, true},
            {true, true, true}};
        allPath("", mazes, 0, 0);
    }

    static void allPath(String p, boolean[][] mazes, int r, int c) {
        if (r == mazes.length - 1 && c == mazes[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!mazes[r][c]) {
            return;
        }

        // i am considering this block in my path
        mazes[r][c] = false;

        // go Vertical/Down
        if (r < mazes.length - 1) {
            allPath(p + 'V', mazes, r + 1, c);
        }
        // go Horizontal/Right
        if (c < mazes[0].length - 1) {
            allPath(p + 'H', mazes, r, c + 1);
        }
        // move Up 
        if (r > 0) {
            allPath(p + 'U', mazes, r - 1, c);
        }
        // move Left
        if (c > 0) {
            allPath(p + 'L', mazes, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removal, also remove the changes that were made by that function 
        mazes[r][c] = true;
    }
}








