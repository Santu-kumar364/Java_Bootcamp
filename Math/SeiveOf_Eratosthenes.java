package Java_Bootcamp.Math;

public class SeiveOf_Eratosthenes {
    public static void main(String[] args) {
        int n = 30;

        boolean[] prime = new boolean[n+1];
        seive(n, prime);
    }

    static void seive(int n, boolean[] prime ) {

        for(int i = 2; i*i <= n; i++) {
            if(prime[i] == false) {
                for(int j = 2*i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(prime[i] == false) {
                System.out.print(i + " ");
            }
        }
    }
}
 




