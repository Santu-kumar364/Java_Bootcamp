package Java_Bootcamp.Basics;

import java.util.Scanner;

public class HcfLcm {
    static int findHcf(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;    
        }
        return a;

    }

    static int findLcm(int a, int b) {
        int hcf = findHcf(a, b);
        return (a * b) / hcf;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ");
        int num1 = sc.nextInt();

        System.out.print("Enter secondd nnuber ");
        int num2 = sc.nextInt();

        System.out.println("Hcf of " + num1 + " and " + num2 + " is " + findHcf(num1, num2));
        System.out.println("Lcm of " + num1 + " and " + num2 + " is " + findLcm(num1, num2));
         
        sc.close();

    }

}




