package Java_Bootcamp.Math;
import java.util.Scanner;

class CheckEven{

    static void isEven(int n) {
        if((n & 1) == 1) {
            System.out.println("it's odd");
        }
        else{
            System.out.println("it's even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
        sc.close();
         
    }
}