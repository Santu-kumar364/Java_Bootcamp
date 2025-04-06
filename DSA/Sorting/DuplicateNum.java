package Java_Bootcamp.DSA.Sorting;

class santu {

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,2};
        System.out.println("Duplicate Number: " + findDuplicate(arr));  
    }

    static int findDuplicate(int[] arr) {
        int i = 0;

        while(i < arr.length) {
            if(arr[i] != i+1) {
                int correct = arr[i] - 1;

                if(arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } 
                else{
                    return arr[i];
                }
            } 
            else{
                i++;
            }

        }

        return -1;

    }
    
    static void swap(int[] arr, int first, int last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        
    }

}
 
