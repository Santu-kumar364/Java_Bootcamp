package Java_Bootcamp.Basics;
import java.util.Scanner;
public class largestNumber {
    static void largest(int a, int b) {
        if(a > b) {
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();

        largest(num1, num2);
        sc.close();
    }
    
}





