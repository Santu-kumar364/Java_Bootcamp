package Java_Bootcamp.DSA.Recursion.StringQuestions;

public class PermutationCount {
     public static void main(String[] args) {
        int result =  permutationsCount("", "abc");
        System.out.println(result);
    }

    static int permutationsCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}


