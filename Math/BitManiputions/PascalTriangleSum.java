package Java_Bootcamp.Math.BitManiputions;
 
import java.util.Scanner;

public class PascalTriangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int n = sc.nextInt();
        sc.close();
        
        // nC0 + nC1 + nC2 + ...... + nCn = 2^n
        // Using left shift to compute 2^(n-1), because index start from 0
        int sum = 1 << (n - 1);  

        System.out.println("Sum of row " + n + " in Pascal's Triangle: " + sum);
    }
}
