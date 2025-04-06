package Java_Bootcamp.patterns;

public class ConcentricSquare {
    public static void main(String[] args) {  
        int n = 4;

        for(int row = 0; row <= 2 * n; row++) {
            for(int col = 0; col <= 2 * n; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(2*n-row, 2*n-col)); 
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();
        }
    }
    
}
















