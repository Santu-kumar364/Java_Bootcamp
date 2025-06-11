package Java_Bootcamp.Basics;
 
import java.util.*;

public class CurrencyConverter {

    public static void main(String[] args) {

        double exchangeRate = 82.0; 

        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        
        double usd  = rupees / exchangeRate;

        System.out.printf("%.2f Rupees in USD: %.2f",rupees,usd);
        sc.close();
    }
    
}
 
  