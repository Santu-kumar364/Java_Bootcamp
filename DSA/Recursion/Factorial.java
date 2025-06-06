package Java_Bootcamp.DSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    static int factorial(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}





