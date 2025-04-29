package Java_Bootcamp.DSA.Recursion.StringQuestions;
import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        ArrayList<String> result = pad("", "12");
        System.out.println(result);

        System.out.println(countPad("", "12"));
    }

    static ArrayList<String> pad(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad(p + ch, up.substring(1)));
        }

        return ans;
    }

    static int countPad(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) -'0';

        int count = 0;
        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + countPad(p + ch, up.substring(1));
        }

        return count;
    }
}


