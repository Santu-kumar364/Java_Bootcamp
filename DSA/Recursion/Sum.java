package Java_Bootcamp.DSA.Recursion;

public class Sum {
      public static void main(String[] args) {
        int res = sum(5);
        System.out.println("sum of N to 1 is: " + res);
      }    

    static int sum(int n) {
        if(n == 1) {
           return 1;
        }
        return n + sum(n-1);
    }
}
