package Java_Bootcamp.Basics;

import java.util.ArrayList;

public class AllFactorOfNums {

    /*static void factors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    
    }*/

    // Time: O(sqrt(n))
    static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n/i == i){
                    System.out.println(i + " ");
                }else {
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    
    }

    public static void main(String[] args) {
        int n = 20;
        factors(n);
    }
    
}



