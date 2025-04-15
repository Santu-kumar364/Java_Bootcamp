package Java_Bootcamp.DSA.Recursion;

public class SumofDigits {

    public static void main(String[] args) {
        int n = 1342;
        int res = sum(n);
        System.out.println(res);
    }

    static int sum(int n) {
        n = Math.abs(n); // handle negative numbers
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }
}


