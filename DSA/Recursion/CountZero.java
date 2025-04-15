package Java_Bootcamp.DSA.Recursion;

public class CountZero {
    public static void main(String[] args) {
        int result = check(3020304, 0);
        System.out.println(result);
    }

    static int check(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return check(n / 10, count + 1);
        }
        else {
            return check(n / 10, count);
        }
    }
}






