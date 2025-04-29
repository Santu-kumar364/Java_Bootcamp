package Java_Bootcamp.DSA.Recursion.ArrayQuestions;
import java.util.ArrayList;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,6,7,9,11};
        int target = 6;
        int result = search(arr, target, 0);
        System.out.println(result);

        // 1st method
        ArrayList<Integer> list = new ArrayList<>();
        findAllIndex(arr, target, list, 0);
        System.out.println(list);

        // 2nd method
        System.out.println(findAllIndex2(arr, target, result));
    }
    // To search a single element
    static int search(int[] arr, int target, int i) {
        if(i == arr.length) return -1;

        if(arr[i] == target) return i;

        return search(arr, target, i+1); 
    }

    // To find all index
     static ArrayList<Integer> findAllIndex(int[] arr, int target, ArrayList<Integer> list ,int i) {
        if(i == arr.length) return list;

        if(arr[i] == target) {
            list.add(i);
        }

        return findAllIndex(arr, target, list, i+1); 
    }


    // To find all index without pass list as an argument
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length) return list;

        // this can contain answer for that function call only
        if(arr[i] == target) {
            list.add(i);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, i+1); 
        list.addAll(ansFromBelowCalls);
        return list;
    }
}





