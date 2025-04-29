package Java_Bootcamp.DSA.Sorting;
import java.util.ArrayList;
import java.util.List;


public class set_mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        List<Integer> result =  mismatch(arr);
        System.out.println(result);
    }

    static List<Integer> mismatch(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1) {

                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } 
                else{
                    if (!list.contains(arr[i])) {  // Avoid adding duplicates multiple times
                        list.add(arr[i]);
                        list.add(i+1);
                    }
                    
                    i++;
                     
                }
            } 
            else{
                i++;
            }

        }

        return list;

    }
    
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        
    }
    
}



