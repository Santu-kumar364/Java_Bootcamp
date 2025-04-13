package Java_Bootcamp.OOPS.abstractDemo;

public class Son extends Parent {

    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        super.printAge();
        System.out.println("\ni am going to be a coder. ");

    } 
}
