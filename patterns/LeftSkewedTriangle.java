package Java_Bootcamp.patterns;

/*public class LeftSkewedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}*/

                      // Numbers

/*public class LeftSkewedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}*/


               // Reverse

public class LeftSkewedTriangle {
    public static void main(String[] args) {
        int n = 6;

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}


/*public class LeftSkewedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row < 2 * n; row++) {
            // Calculate the number of stars for the current row
            int stars = row < n ? row : 2 * n - row;    // Ternary operator

            for(int column = 1; column <= stars; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
 
    }
    
}*/





