package Java_Bootcamp.Math;

public class fibbonacciSeries {
    
    static void checkFibo(int n) {
        int f1 = 0;
        int f2 = 1;

        for(int i = 0; i <= n; i++) {
            System.out.print(f1 + " ");
            int next = f1+ f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main(String[] args) {
        checkFibo(10);
        
    }
    
}
