package Java_Bootcamp.OOPS.Inheritance;

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

// Final derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Methods inherited from Animal, Mammal, and Dog
        dog.eat();   // From Animal
        dog.walk();  // From Mammal
        dog.bark();  // From Dog
    }
}

