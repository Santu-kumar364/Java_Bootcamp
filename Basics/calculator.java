package Java_Bootcamp.Basics;
import java.util.Scanner;
 
 

public class calculator {

    static void basicCalculator() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operator (+, -, *, /) or X to exit:");
            char symbol = sc.next().charAt(0);

            if (symbol == 'X' || symbol == 'x') {
                System.out.println("Exiting the calculator...");
                break;
            }

            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                System.out.println("Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();

                switch (symbol) {
                    case '+' -> System.out.println("Result: " + (a + b));
                    case '-' -> System.out.println("Result: " + (a - b));
                    case '*' -> System.out.println("Result: " + (a * b));
                    case '/' -> {
                        if (b != 0) {
                            System.out.println("Result: " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                    }
                }
            } else {
                System.out.println("Invalid operator. Please enter +, -, *, /, or X to exit.");
            }
        }

        sc.close();  // Close scanner to prevent memory leaks
    }

    public static void main(String[] args) {
        basicCalculator();
    }
}
