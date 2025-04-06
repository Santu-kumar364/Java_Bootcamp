package Java_Bootcamp.Math.BitManiputions;
import java.util.Scanner;

public class Nth_bitOfNumber {
    static int ans(int num) {
        int indexAt = 2;
        int result = 1 << (indexAt-1);
        
        return (num & result) >> (indexAt - 1);     //if we AND(&), anyNumber with 1 it return that number.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // 10 = 1010

        System.out.println(ans(num));
        sc.close();
    }
    
}





 