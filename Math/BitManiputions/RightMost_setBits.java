package Java_Bootcamp.Math.BitManiputions;

public class RightMost_setBits {

    public static void main(String[] args) {
        int n = 9; // 1001

        // int negative = -n;  
        int negative = ~n + 1;  // by the help of Twos complement
        int ans = n & negative;
        System.out.println(ans);
    }
    
}




