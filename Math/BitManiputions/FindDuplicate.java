package Java_Bootcamp.Math.BitManiputions;


public class FindDuplicate {

    static int ans(int[] arr) {
        int unique = 0;

        for(int a : arr) {
            unique ^= a;
        }

        for (int i = 1; i < arr.length; i++) {
            unique ^= i;
        }

        return unique;
    }

    public static void main(String[] args) {

        int[] arr = {4,3,2,4,1};
        System.out.println(ans(arr));
    }
    
}




 