package Java_Bootcamp.DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fibo(7);
        System.out.println("Result: " + result);
    }

    static int fibo(int n) {
        if(n < 0) {
            System.out.println("Negative is invalid");
            return -1;
        }
        if(n < 2) return n;
        
        return fibo(n-1) + fibo(n-2);
    }
}



