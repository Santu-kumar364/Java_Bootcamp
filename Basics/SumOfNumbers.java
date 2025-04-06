package Java_Bootcamp.Basics;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class SumOfNumbers {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter numbers to add to the sum. Enter 0 to stop.");

//         int sum = 0;
//         while(true) {
//             int num = sc.nextInt();

//             if(num == 0) {
//                 break;
//             }  
//             sum += num;
 
//         }
 
//         System.out.println("The sum of all entered numbers is: " + sum);
//         sc.close();
        
//     }
       
// }



import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to add to the sum. Enter x to stop.");

        int sum = 0;

        while (true) {
            String input = sc.nextLine(); 

            if (input.equalsIgnoreCase("x")) { 
                break;
            }

            try {
                int num = Integer.parseInt(input); // Convert input to an integer
                sum += num; // Add the number to the sum
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to stop.");
            }
        }

        System.out.println("The sum of all entered numbers is: " + sum);
        sc.close();
    }
}




