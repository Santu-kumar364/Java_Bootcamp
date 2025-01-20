package Java_Bootcamp.patterns;

public class Diamond {

    public static void main(String[] args) {
        int n = 5;

        //Upper-part
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower-part
        for(int i = n-1; i >= 1; i--) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}





