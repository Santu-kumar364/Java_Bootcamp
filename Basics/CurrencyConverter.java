package Java_Bootcamp.Basics;
 
import java.util.Arrays;

/*public class CurrencyConverter {

    public static void main(String[] args) {

        double exchangeRate = 82.0; 

        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        
        double usd  = rupees / exchangeRate;

        System.out.printf("%.2f Rupees in USD: %.2f",rupees,usd);
        sc.close();
    }
    
}*/
 
 

class CurrencyConverter {

    static void selection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minVal = i;
            for (int j = i; j < n; j++) {  // Corrected loop condition
                if (arr[j] < minVal) {
                    minVal = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minVal];
            arr[minVal] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 0, 10, 7, 25, 17};
        selection(arr);
    }
}







