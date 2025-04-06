package Java_Bootcamp.OOPS.staticKwd;

public class Main {
    public static void main(String[] args) {
        Car bugati = new Car("Bugati", 4, false);
        Car tesla = new Car("Tesla", 4, true);

        System.out.println(Car.population);


    }

    static void fun() {
        // since, greeting is non-static , we have create an object.
        Main obj = new Main();   
        obj.greeting();

       // greeting();   // in the static methode , can't use non-static 
    }

    // we know that something which is non-static , belong to an object
    void greeting() {
        fun();          // static methode in non-static 
        System.out.println("Hello world");
    }

    
}







