package Java_Bootcamp.DSA.Recursion;

public class Mul {
    public static void main(String[] args) {
        int res = mul(5);
        System.out.println("Product of N to 1 is: " + res);
    }

    
    static int mul(int n) {
        if(n == 1) {
           return 1;
        }

        // System.out.println(n); 
        return n * mul(n-1);
    }
}
