package Java_Bootcamp.Basics;

import java.util.Scanner;

public class calculator {

    static void basicCalculator(int a, int b, Scanner sc) {
        System.out.println("choose operator");
        char symbol = sc.next().charAt(0);

        switch(symbol) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);

            case '/' -> {
                if(b != 0) {
                    System.out.println(a / b);
                    
                }
                else {
                    System.out.println("you can not divide by zero.");
                }
            }

            default -> System.out.println("Invalid operator.");
           
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();

        basicCalculator(num1, num2, sc);
    }             
    
}
