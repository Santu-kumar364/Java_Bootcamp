package Java_Bootcamp.Math;

public class SquarRoot {

    // Time: O(log(n))
    static double  root(int n, int p) {
        int start = 0; 
        int end = n;
        double root = 0.0;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid * mid == n) {
                return mid;
            }
            if(mid * mid > n) {
                end = mid - 1;
            } else {
                root = mid;
                start = mid + 1;
            }
        }

        // for prision value
        double incr = 0.1;
        for (int i = 0; i <= p; i++) {
            while(root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
 
        return root;
    }

    public static void main(String[] args) {
        int n = 40;
        int p = 3;  // prision value
        System.out.printf("The sqrt of %d is: %.3f",n,root(n, p));
    }
    
}





