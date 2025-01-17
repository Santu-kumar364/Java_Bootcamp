package Java_Bootcamp.OOPS.polymorphism;

class Calculator {
    
    // Overloaded method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the overloaded add method for two integers
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));

        // Calling the overloaded add method for three integers
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));

        // Calling the overloaded add method for two doubles
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
    }
}

