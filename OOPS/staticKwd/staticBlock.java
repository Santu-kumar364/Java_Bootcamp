package Java_Bootcamp.OOPS.staticKwd;

public class staticBlock {
    int a = 3; 
    static int b;
    static int c = 5;

    // will only once, when is the first object is create i.e when the class is loaded for the first time.
    static {
        System.out.println("I am in static block.");
        b = c * 5;
    }

    public static void main(String[] args) {
        
        staticBlock obj = new staticBlock();
        System.out.println(obj.a);

        // static variable and methode depends on class Not the Object.
        System.out.println(staticBlock.b);
    }
}
