package Java_Bootcamp.DSA.Recursion;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        System.out.println();
        reverseFun(5);
        System.out.println();
        funBoth(5);


        System.out.println("sum of N to 1: " + sum(5));
        System.out.println("product from N to 1:" + mul(5));
    }

    static void fun(int n) {
        if(n == 0) {
           return;
        }

        System.out.println(n); 
        fun(n-1);
    }

    // Reverse function
    static void reverseFun(int n) {
        if(n == 0) {
           return;
        }
        
        reverseFun(n-1);
        System.out.println(n); 
    }

    static void funBoth(int n) {
        if(n == 0) {
           return;
        }
        System.out.println(n); 
        fun(n-1);
        reverseFun(n-1);
        System.out.println(n); 
    }
}


    
     

              


