package Java_Bootcamp.patterns;

public class Hourglass {

    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < 2*n; i++) {

            int spaces = i < n ? i : 2*n - i - 1;
            int stars = i < n  ? n- i : i - n + 1; 
 
            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");  
            }
            System.out.println();
        }
    }
}
    






 