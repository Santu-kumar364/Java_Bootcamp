package Java_Bootcamp.DSA.Recursion;

class Fibonacci {
    public static void main(String[] args) {
        // int result = fibo(10);
        // System.out.println(result);
   
        System.out.println(fiboFormula(50));
    }

    // by the help of Time Complexity
    static int fiboFormula(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5)) ;
    }

    // recursive way
    static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

// fibonacci sequences
// 0 1 2 3 5 8 13 21 34 55

