package Java_Bootcamp.Stringz;

/*public class Palindrome {
    public static void main(String[] args) {
        String str = "Race car";
        str = str.toLowerCase().replaceAll("[^a-zA-z]", "");
        checkPalindrome(str);
    }

    static void checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome) {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }

        

    }

    

    
}
*/

 
class santu{
    public static void main(String[] args) {
        String a = "santu";
        // String b = "santu";

        // String a = new String("ajeet");
        
        String b = new String("santu");

         System.out.println(a==b);
         System.out.println(a.equals(b));
        
    }
} 