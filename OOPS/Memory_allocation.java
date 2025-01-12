package Java_Bootcamp.OOPS;

public class Memory_allocation {
    
    public static void main(String[] main) {

        A obj;

        for(int i = 0; i < 1000000000; i++) {
            obj = new A("Random name"); 
        }
    
}

            
class A {

    String name;
            
    public A(String name) {
        System.out.println("object created");
        this.name = name;
    }
     
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }

}











