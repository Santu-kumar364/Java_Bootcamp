package Java_Bootcamp.Stringz;

// public class Palindrome {
//         String str = "Race car";
//         str = str.toLowerCase().replaceAll("[^a-zA-z]", "");
//         checkPalindrome(str);
//     }
//     static void checkPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;
//         boolean isPalindrome = true;
//         while(left < right) {
//             if(str.charAt(left) != str.charAt(right)) {
//                 isPalindrome = false;
//                 break;
//             }
//             left++;
//             right--;
//         }
//         if(isPalindrome) {
//             System.out.println("yes");
//         }
//         else {
//             System.out.println("No");
//         }
//     } 
// }




class Solution {
    public static void main(String[] args) {
        String str = "Race c$%ar";
        // String str = "A man, a plan, a canal: Panama";
        System.out.println(Palindrome(str));
    }

    static boolean Palindrome(String str) {
        if(str.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            char currFirst = str.charAt(start);
            char currLast = str.charAt(end);

            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                end--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++; 
                end--;
            }
        }

        return true;
    }
}




 