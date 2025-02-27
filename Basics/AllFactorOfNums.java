package Java_Bootcamp.Basics;

public class AllFactorOfNums {

    static void factors(int n) {
        
        int i = 1;
        while(i <= n) {
            if(n % i == 0) {
                System.out.print(i + " ");   
            }
            i++;
        }

    }

    public static void main(String[] args) {
        int n = 12;
        factors(n);

    }
    
}



