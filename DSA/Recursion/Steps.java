package Java_Bootcamp.DSA.Recursion;

public class Steps {
    public static void main(String[] args) {
        System.out.println("in the " + numberOfSteps(12) + " steps become zero");
    }

    static  int numberOfSteps(int num) {
        return steps(num, 0);
    }

    static int steps(int n, int step) {
        if(n == 0) return step;

        if(n % 2 == 0) {
            return steps(n / 2, step + 1);
        }
        else {
            return steps(n - 1, step + 1);
        }
    }
}