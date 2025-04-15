package Java_Bootcamp.DSA.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1243;
        int res = product(n);
        System.out.println(res);
    }

    static int product(int n) {
        n = Math.abs(n); // handle negative numbers
        if (n == 1) {
            return 1;
        }

        return (n % 10) * product(n / 10);
    }
}



