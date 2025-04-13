package Java_Bootcamp.OOPS.staticKwd;

/*class Test {
    static String name;
     
    public Test(String name) {
        this.name = name;
    }
}

public class InnerClasses {

    public static void main(String[] args) {
        // Creating objects of the static inner class
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        // Printing the name fields of both objects
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
*/




public class InnerClasses {

    static class Test {

        String name;

        // Constructor to initialize the name field
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Creating objects of the static inner class
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        // Printing the name fields of both objects
        System.out.println(a.name);
        System.out.println(b.name);
    }

}
