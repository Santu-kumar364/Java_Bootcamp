package Java_Bootcamp.DSA.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,7,8,9,11,12};
        int missing = sort(arr);
        System.out.println(missing);   
    }

    static int sort(int[] arr) {
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

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1 ) {
                return index + 1 ;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int current, int correct) {
        int temp = arr[current];
        arr[current] = arr[correct];
        arr[correct] = temp;
    }
    
}



