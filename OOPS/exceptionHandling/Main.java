package Java_Bootcamp.OOPS.exceptionHandling;

 
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // divide(a, b);   
            String name = "santu";
            if(name.equals("santu")) {
                throw new MyException("name is santu");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exceptions");
        }
        finally {
            System.out.println("this will always be executed.");
        }
        
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}



















