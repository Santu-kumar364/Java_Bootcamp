package Java_Bootcamp.Math.BitManiputions;

import java.util.Scanner;

public class CheckOddEven {

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isOdd(num));
        sc.close();
    }
    
}




































