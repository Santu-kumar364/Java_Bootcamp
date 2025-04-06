package Java_Bootcamp.DSA.Sorting;
import java.util.ArrayList;
import java.util.List;

public class MissingAllNum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 1, 7, 2};

        List<Integer> result =  AllMissing(arr);
        if (result.isEmpty()) {
            System.out.println("No numbers are missing!");
        } else {
            System.out.println("Missing Numbers are: " + result); 
        }
             
    }

    static List<Integer> AllMissing(int[] arr) {

        int i = 0; 
        while(i < arr.length) {
            int correct = arr[i] - 1 ;
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            }
            else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1 ) {
                list.add(index+1) ;
            }
        }

        return list;
        
    }
    
    static void swap(int[] arr, int current, int correct) {
        int temp = arr[current];
        arr[current] = arr[correct];
        arr[correct] = temp;
    }

}



