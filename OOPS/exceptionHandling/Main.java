package Java_Bootcamp.OOPS.exceptionHandling;

 

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            divide(a, b);   
        } catch (ArithmeticException  e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always be executed.");
        }
        
    }

    static int divide(int a, int b) {
        return a/b;
    }
    
}



















