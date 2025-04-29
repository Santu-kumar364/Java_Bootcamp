package Java_Bootcamp.DSA.Recursion;
//     public static void main(String[] args) {
//         // String str = "Race c$%ar";
//         String str = "A man, a plan, a canal: Panama";
//         int start = 0;
//         int end = str.length() - 1;
//         System.out.println(isPalindrome(str, start, end));
//     }

//     static boolean isPalindrome(String str, int start, int end) {
//         if (str.isEmpty()) {
//             return true;
//         }
//         if (start >= end) {
//             return true;
//         }

//         char currFirst = str.charAt(start);
//         char currLast = str.charAt(end);

//         if (!Character.isLetterOrDigit(currFirst)) {
//             return isPalindrome(str, start + 1, end);
//         } 
//         else if (!Character.isLetterOrDigit(currLast)) {
//             return isPalindrome(str, start, end - 1);
//         } 
//         else {
//             if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
//                 return false;
//             }
//             return isPalindrome(str, start + 1, end - 1);
//         }
//     }
// }




public class Palindrome {
    static int sum = 0;
    static int reverse(int n) {
        if(n == 0) return sum;

        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n / 10);
    }

    static boolean palin(int n) {
        return n == reverse(n);
    }

    
    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }
}





