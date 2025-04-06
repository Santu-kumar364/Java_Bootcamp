package Java_Bootcamp.DSA.Searching;

public class LinearSerch {
    static int  search(int[] arr , int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }   
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {-1,4,9,3,10,19,21,14,7};
        int target = 10;
        int result = search(arr, target); 

        if(result != -1) {
            System.out.println(target + " found at index: " + result);
        } 
        else {
            System.out.println("Not found");
        }
         
    }
    
}




