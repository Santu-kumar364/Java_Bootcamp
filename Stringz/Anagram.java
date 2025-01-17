package Java_Bootcamp.Stringz;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String A = "Listen";
        String B = "Silent";
    
        checkAnagram(A, B);
    }

    static void checkAnagram(String A, String B) {

        if(A.length() != B.length()) {
            System.out.println("size mis-match");
            return;
        }

        A = A.toLowerCase().replaceAll("[^a-zA-z]", "");
        B = A.toLowerCase().replaceAll("[^a-zA-z]", "");

        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < A.length(); i++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("No");
            }
        }

        System.out.println("yes");

    }

}






