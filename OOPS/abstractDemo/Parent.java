package Java_Bootcamp.OOPS.abstractDemo;

public abstract class Parent {

    public static final String printCity = null;
    int age;

    Parent(int age) {
        this.age = age;
    }

    // abstract methode
    abstract void career(); 

    // normal methode
    void pringAge() {
        System.out.printf("I am %d years old.", age);
    } 

    // static methode
    static void printCity() {
        System.out.println("Mumbai");
    }
    
}
