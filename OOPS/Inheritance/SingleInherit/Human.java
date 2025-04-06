package Java_Bootcamp.OOPS.Inheritance.SingleInherit;

public class Human {

    String name;
    int age;
    boolean isStudent;

    public Human() {

    }

    public Human(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public Human(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    public String toString() {
        return "my name is: " + name + "\nAge: " + age + "\nStudent: " + isStudent;
    }

    
}
