package Java_Bootcamp.Math;

public class setIndex {

    static int ans(int num, int index) {

        int result = 1 << index - 1;
        return (result | num) ;

    }

    public static void main(String[] args) {
        int n = 4; // 0100 
        int idx = 2;
        System.out.println(ans(n, idx));
    }
    
}








