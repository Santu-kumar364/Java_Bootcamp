package Java_Bootcamp.OOPS.interfaces.interfaceDemo;

public class Main implements B {
    @Override
    public void name() {
        System.out.println("i hope you know who i am.");
        
    }

    @Override
    public void Greeting() {
        System.out.println("Greetings");
        
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.Greeting();
        obj.name();
        A.fun();   // calling static method
        
    }
    
}







