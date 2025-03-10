package Java_Bootcamp.DSA.Searching;

public class SearchString {

    static int search(String str, char target) {
        if(str.length() == 0) {
            return -1;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String str = "Santu";
        char target = 'n';
        int result = search(str, target);

        if(result != -1) {
            System.out.println(target + " found at index: " + result);
        }
        else{
            System.out.println("Not found");
        }
         
    }
}






