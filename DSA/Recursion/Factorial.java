package Java_Bootcamp.DSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }

    static int factorial(int n) {
        if(n < 0) {
            System.out.println("Factorial is not defined for negative value");
        }
        if(n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}





