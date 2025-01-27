package Java_Bootcamp.patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        
        for(int row = 1; row < 2 * n; row++) {

            // the number of stars
            int stars = row < n ? row : 2 * n - row;
            // left stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // the number of spaces
            int spaces = row < n ? 2 * (n - row) : 2 * (row - n);
            // spaces
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // right stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
    
}
 





/*class santu {
    public static void main(String[] args) {

        int n = 4;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
} */










