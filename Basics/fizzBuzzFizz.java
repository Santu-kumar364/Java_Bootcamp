package Java_Bootcamp.Basics;
import java.util.Scanner;

public class fizzBuzzFizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizzBuzzFizz");
        }
        else if(num % 3 == 0) {
            System.out.println("fizz");
        }
        else if(num % 5 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
        sc.close();
        
    }
    
}
