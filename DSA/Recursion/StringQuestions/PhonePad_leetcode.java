package Java_Bootcamp.DSA.Recursion.StringQuestions;
import java.util.ArrayList;

public class PhonePad_leetcode {
    public static void main(String[] args) {
        System.out.println(pad( "", "23"));
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();
        String letters = selectLetters(digit);

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            ans.addAll(pad(p + ch, up.substring(1)));
        }

        return ans;
    }

    static String selectLetters(int digits) {
        return switch(digits) {
            case 2 -> "abc";
            case 3 -> "def";
            case 4 -> "ghi";
            case 5 -> "jkl";
            case 6 -> "mno";
            case 7 -> "pqrs";
            case 8 -> "tuv";
            case 9 -> "wxyz";
            default -> "";
        };
    }
} 
