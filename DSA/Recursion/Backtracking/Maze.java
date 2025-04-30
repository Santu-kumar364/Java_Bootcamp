package Java_Bootcamp.DSA.Recursion.Backtracking;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze( "", 3, 3));
    }

    static ArrayList<String> maze(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        // go Vertical/Down
        if(r > 1) {
            ans.addAll(maze(p + 'V', r - 1, c));
        }
        // go Horizontal/Right
        if(c > 1){
            ans.addAll(maze(p + 'H', r, c- 1));
        }
        // move Diagonal wise
        if(c > 1 && r > 1) {
            ans.addAll(maze(p + 'D', r-1, c-1));
        }

        return ans;
    }
}
