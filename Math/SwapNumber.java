package Java_Bootcamp.Math;

import java.util.Scanner;

public class SwapNumber {

    static void swap(int a, int b) {
        /*a = a + b; 
        b = a - b; 
        a = a - b;*/

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a is: ");
        int num = sc.nextInt();
        System.out.print("b is: ");
        int num2 = sc.nextInt();

        swap(num, num2);
        sc.close();
    }
    
}





