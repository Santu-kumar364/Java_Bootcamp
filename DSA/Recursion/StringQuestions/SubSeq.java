package Java_Bootcamp.DSA.Recursion.StringQuestions;
import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqList("", "abc"));

        // 3rd approach
        System.out.println("\n3rd approach");
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSets(arr);
        for(List<Integer> list : ans) {
            System.out.println(list);
        }


        // 4th approache
        System.out.println("\n4th approach");
        int[] arr1 = {1,2,2};
        List<List<Integer>> ans1 = subSetsDuplicate(arr1);
        for(List<Integer> list1 : ans1) {
            System.out.println(list1);
        }
    }

    // 1st methode
    static void subseq(String current, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(current);
            return;
        }

        char ch = remaining.charAt(0);
        subseq(current + ch, remaining.substring(1));
        subseq(current, remaining.substring(1)); 
    }


    // 2nd methode via return a list
    static ArrayList<String> subseqList(String current, String remaining) {
       
        if (remaining.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(current);
            return list;
        }

        char ch = remaining.charAt(0);
        ArrayList<String> left = subseqList(current + ch, remaining.substring(1));
        ArrayList<String> right =  subseqList(current, remaining.substring(1)); 

        left.addAll(right);
        return left;
    }


    // Iterative approach
    static List<List<Integer>> subSets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);  
            }
        }

        return outer;
    }

    // 4th Approach
    static List<List<Integer>> subSetsDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            start = 0;
            // if current or previous element is same, s = e + 1 
            if(i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}











