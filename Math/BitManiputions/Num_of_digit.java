package Java_Bootcamp.Math.BitManiputions;

// to find number of digits in num

// public class Num_of_digit {

//     public static void main(String[] args) {
//         // int n = 6;  // 110
//         int n = 9;  // 1001
//         int count = 0;

//         while(n > 0) {
//             n = n >> 1;
//             count++;
//         }

//         System.out.println(count);
//     }
    
// }



class Num_of_digit {
    public static void main(String[] args) {
        // int n = 47521824;
        // int base = 10;

        int n = 9; // 1001
        int base = 2;

        int ans = (int) (Math.log(n) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}