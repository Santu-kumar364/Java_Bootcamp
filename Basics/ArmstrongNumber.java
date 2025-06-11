package Java_Bootcamp.Basics;
import java.util.Scanner;
public class ArmstrongNumber {

    static void armstrong(int n) {
        int originalNum = n;    // Store the original number for comparison
        int numDigits = 0;
        int temp = n;

        while (temp > 0) {
            temp = temp / 10;   
            numDigits++;
        }

        int sum = 0;

        while(n > 0) {
            int last = n % 10;
            sum +=  Math.pow(last, numDigits);
            n /= 10;
        }

        if(sum == originalNum) {
            System.out.println("yes this is Armstrong Number.");
        }
        else {
            System.out.println("No, this is not Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        armstrong(num);
        sc.close();
    }
}










