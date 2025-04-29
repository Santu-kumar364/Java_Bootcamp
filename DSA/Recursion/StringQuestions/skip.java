package Java_Bootcamp.DSA.Recursion.StringQuestions;

public class skip {
    public static void main(String[] args) {
        String str = "asdappledj";
        System.out.println(skipChar(str));

        System.out.println(skipApple(str));
    }

    static String skipChar(String str) {
        if(str.isEmpty()) return "";

        char ch = str.charAt(0);

        if(ch == 'a') {
            return skipChar(str.substring(1));
        }
        else {
            return ch + skipChar(str.substring(1));
        }
    }


    static String skipApple(String str) {
        if(str.isEmpty()) return "";

        if(str.startsWith("apple")) {
            return skipApple(str.substring(5));
        }
        else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }
}



