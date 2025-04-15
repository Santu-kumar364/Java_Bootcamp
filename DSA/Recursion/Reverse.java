package Java_Bootcamp.DSA.Recursion;

// way - 1
// public class Reverse {
//     public static void main(String[] args) {
//        reverse(12345);
//        System.out.println(sum);
//     }

//     static int sum = 0;
//     static void reverse(int n) {
//         if(n ==  0) {
//             return;
//         }
//         int rem = n % 10;
//         sum = sum * 10 + rem;

//         reverse(n/10);
//     }
// }



public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        int digits = (int)Math.log10(n) + 1;
        int result = reverse2(n, digits);
        System.out.println(result);
     }

    static int reverse2(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int)(rem * Math.pow(10, digits - 1)) + reverse2(n / 10, digits -1);
    }
}




 

