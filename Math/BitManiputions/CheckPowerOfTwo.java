package Java_Bootcamp.Math.BitManiputions;
 
import java.util.Scanner;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        // A number is a power of 2 if (n & (n - 1)) == 0 and n > 0
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.printf("%d is a power of 2\n", n);
        } else {
            System.out.println("No");
        }
    }
}
