package Java_Bootcamp.OOPS;

public class Final_kwd {

    public static void main(String[] args) {
        
        final A santu = new A("santu");

        // since, it's not primative , can be changed only object.
        santu.name = "Ajeet";                

        // when a non primative is final , you can not reassign it
        //santu = new A("new object");     
    
        System.out.println(santu.name);

        //santu.a = 20;              // primative data type can not be modify or change
        System.out.println(santu.a);
    }  
    

}


class A {
    final int a = 10;         // if you're using Final keyword , initialize the value/object while declaring 
    String name;

    public A(String name) {
        this.name = name;
    }
}
