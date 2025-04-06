package Java_Bootcamp.patterns;

/*public class NumberPyramid {

    public static void main(String[] args) {
        int n = 5; 

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int j = 2; j <= row ; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        } 

    }

}*/


                        // top-bottom pyramid   or Diamond Number Pattern

public class NumberPyramid {

    public static void main(String[] args) {
        int n = 4; 

        for(int row = 1; row < 2 * n; row++) {
            // number of stars
            int stars = row < n ? row : 2*n - row;

            for(int col = 1; col <= n - stars; col++) {
                System.out.print("  ");
            }

            for(int col = stars; col >= 1; col--) {
                System.out.print(col + " ");
            }
 
            for(int j = 2; j <= stars ; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        } 
 

    }

}









