package Java_Bootcamp.Math;

import java.util.Scanner;

public class PrimeNumber {

    static boolean checkPrime(int n) {
        // if n is less than 2
        if(n <= 1) {
            return false;
        }

        int i = 2;  // smallest prime number
        while (i*i < n) { 
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(checkPrime(num)) {
            System.out.println("yes, it is prime");
        }
        else {
            System.out.println("No, it is not prime");
        }
         
        sc.close();
        
    }
    
}


