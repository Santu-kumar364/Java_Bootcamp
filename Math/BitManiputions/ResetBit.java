package Java_Bootcamp.Math.BitManiputions;

public class ResetBit {

    static int resetMethode(int n , int idx) {
        int mask = ~(1 << (idx - 1));
        return n & mask;
    }

    
    public static void main(String[] args) {
        int n = 9;
        int idx = 1;
        int result = resetMethode(n, idx);
        System.out.println(result);
        
    }
    
}




         


