package Java_Bootcamp.Math.BitManiputions;

public class FindUnique {

    static int ans(int[] arr) {
        int unique = 0;

        for(int a : arr) {
            unique ^= a;
        }

        return unique;
    }

    public static void main(String[] args) {

        int[] arr = {3,1,4,3,2,4,1};   // if repreatation is even times
        System.out.println(ans(arr));
    }
    
}





