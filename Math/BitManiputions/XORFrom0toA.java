package Java_Bootcamp.Math.BitManiputions;
 
public class XORFrom0toA {
    public static void main(String[] args) {
        int a = 4;
    
        int result = switch (a % 4) {
            case 0 -> a;
            case 1 -> 1;
            case 2 -> a + 1;
            case 3 -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + (a % 4));
        };

        System.out.println("XOR from 0 to " + a + " is: " + result);
       
    }
}









