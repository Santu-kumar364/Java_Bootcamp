package Java_Bootcamp.patterns;

import java.util.ArrayList;
import java.util.List;

/*public class Diamond {

    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row < 2 * n; row++) {
            int totalSpaces = row < n ? n-row : row - n;
            int totalStars = row < n ? 2 * row - 1 : 2 * (2 * n - row) - 1;

            for(int space = 0; space < totalSpaces; space++) {
                System.out.print(" ");
            }

            for(int star = 0; star < totalStars; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

          
    }
    
}*/


 
                 //  Diamond Pattern with Spaces.

/*class santu {
    
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 0; i < 2*n; i ++) {

            int stars = i < n ? n-i : i-n+1;
            int spaces = i < n ? 2*i : 2*(2*n-i - 1);

            for(int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
           
        }
    }
}
*/





public class Diamond {

     public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List<String> list1 = new ArrayList(); 
        list1.add("foo"); 
        List<String> list2 list1; 
        List<String> list3 = new ArrayList(list2); 
        list1.clear(); 
        list2.add("bar"); 
        list3.add("baz"); 
        System.out.print(list1); 
        System.out.print(list2); 
        System.out.print(list3);
       
     }
} 








