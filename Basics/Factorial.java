package Java_Bootcamp.Basics;

public class Factorial{

    static void check(int n) {
        int a = 1;
        if(n == 0 || n == 1) {
            System.out.printf("Factorial of %d is : %d", n,1);
            return;
        }
    
        int temp = n;
        while(n > 0) {
            a *= n;
            n--;
        }
        System.out.printf("Factorial of %d is : %d", temp, a);
    }

    public static void main(String[] args) {
        
        check(5);
    }
}


