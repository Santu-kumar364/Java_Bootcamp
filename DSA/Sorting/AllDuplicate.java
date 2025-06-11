package Java_Bootcamp.DSA.Sorting;
import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 1, 7, 2};

        List<Integer> result =  All_Duplicate(arr);
        if (result.isEmpty()) {
            System.out.println("No numbers are missing!");
        } 
        else {
        System.out.println("Duplicate Numbers are: " + result); 
        }

    }

    static List<Integer> All_Duplicate(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1) {

                int correct = arr[i] - 1;
                if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } 
                else{
                    if (!list.contains(arr[i])) {  // Avoid adding duplicates multiple times
                        list.add(arr[i]);
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


