package Java_Bootcamp.DSA.Recursion.Backtracking;
import java.util.ArrayList;

public class Maze_Obstacle {
    public static void main(String[] args) {
        boolean[][] mazes = {
            {true, true, true},
            {true, false, true},
            {true, true, true}};
        System.out.println(mazeObs("", mazes, 0, 0));
    }

    static ArrayList<String> mazeObs(String p, boolean[][] mazes, int r, int c) {
        if (r == mazes.length - 1 && c == mazes[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Block the path if it's obstacle cell (1,1)
        if (!mazes[r][c]) {
            return new ArrayList<>();
        }

        ArrayList<String> ans = new ArrayList<>();
        // go Vertical/Down
        if (r < mazes.length - 1) {
            ans.addAll(mazeObs(p + 'V', mazes,r + 1, c));
        }
        // go Horizontal/Right
        if (c < mazes[0].length - 1) {
            ans.addAll(mazeObs(p + 'H', mazes, r, c + 1));
        }
        // move Diagonal wise
        if (r < mazes.length - 1 && c < mazes[0].length - 1) {
            ans.addAll(mazeObs(p + 'D', mazes, r + 1, c + 1));
        }

        return ans;
    }
}
