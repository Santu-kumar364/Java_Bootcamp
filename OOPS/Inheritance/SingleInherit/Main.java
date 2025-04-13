package Java_Bootcamp.OOPS.Inheritance.SingleInherit;

public class Main extends Human {
    String city;
    Main(String name, int age, boolean isStudent,String city){
        super(name, age, isStudent);
        this.city = city;
    }
    Main(boolean isStudent,String city){
        super(isStudent);
        this.city = city;
    }
    
    public String toString() {
        return super.toString() + "\n" + city;
    }

    public static void main(String[] args) {
        //Main santu = new Main("santu",21, true, "mumbai");
        //Main santu = new Main(true, "mumbai");
    //    Human ajeet = new Human("ajeet", 12,false);

       //Main santu = (Main) new Human("santu", 19, true);

       // it is valid Because Main is subclass of Human
    //    Human ajeet = new Main("ajeet", 12,false, "Mumbai");

    //    System.out.println(ajeet.toString());
    //    System.out.println(santu.toString());
        
    }
    
}



