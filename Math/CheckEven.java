package Java_Bootcamp.Math;

import java.util.Scanner;

public class CheckEven {

    static boolean isEven(int n) {
        if(n % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isEven(num)) {
            System.out.println("yes, it is Even");
        }
        else {
            System.out.println("No, it is not Odd");
        }
       
        sc.close();  
    }
    
}