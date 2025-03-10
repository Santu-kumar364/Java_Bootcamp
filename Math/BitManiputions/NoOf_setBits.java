package Java_Bootcamp.Math.BitManiputions;

public class NoOf_setBits {
    static void noOfsetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 9; // 1001
        noOfsetBits(n);
         
    }
    
}





