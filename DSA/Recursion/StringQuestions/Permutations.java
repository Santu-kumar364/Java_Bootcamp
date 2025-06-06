package Java_Bootcamp.DSA.Recursion.StringQuestions;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> result =  permutations("", "abc");
        System.out.println(result);
    }

    static ArrayList<String> permutations(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations(f + ch + s, up.substring(1)));
        }

        return ans;
    }
}






