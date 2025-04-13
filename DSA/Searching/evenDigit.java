package Java_Bootcamp.DSA.Searching;


public class evenDigit {
    public static void main(String[] args) {
        int[] nums = {18,-1423,93,98,176};
        int result = findNumbers(nums);
        System.out.println(result); 
    }

    static int findNumbers(int[] nums){ 
        int count = 0;
        for(int ele : nums) {
            if(even(ele)) {
                count++;
            }
        }  
        return count;      
    }

    // function to check weather a number contains even digits or not 
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if((numberOfDigits & 1) == 0) {
            return true;
        }
        return false;
    }

    // count number of digits 
    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }           
}







