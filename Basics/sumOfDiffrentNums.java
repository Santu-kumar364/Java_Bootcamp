package Java_Bootcamp.Basics;
import java.util.Scanner;
 
class SumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0, sumPositiveEven = 0, sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            int num = sc.nextInt();

            // Terminate input if the user enters 0
            if (num == 0) {
                break;
            }

            if (num < 0) {
                sumNegative += num; // Add to sum of negative numbers
            } else if (num % 2 == 0) {
                sumPositiveEven += num; // Add to sum of positive even numbers
            } else {
                sumPositiveOdd += num; // Add to sum of positive odd numbers
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        sc.close(); // Close the scanner
    }
}

 