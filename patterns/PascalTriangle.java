package Java_Bootcamp.patterns;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(4));
        System.out.println(getRow(4));
    }
    
    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) return triangle;
        
        // First row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            
            // First element is always 1
            row.add(1);
            
            // Middle elements are sum of two elements above
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            
            // Last element is always 1
            row.add(1);
            
            triangle.add(row);
        }
        
        return triangle;
    }
    
    // For getting a specific row using binomial coefficients
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // C(n,0) = 1
        
        for (int k = 1; k <= rowIndex; k++) {
            // Compute C(n,k) from C(n,k-1)
            int next = row.get(k-1) * (rowIndex - k + 1) / k;
            row.add(next);
        }
        
        return row;
    }
}







