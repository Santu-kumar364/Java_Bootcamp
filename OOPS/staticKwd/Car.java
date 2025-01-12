package Java_Bootcamp.OOPS.staticKwd;

public class Car {

    String name;
    int wheels;
    boolean isDriverless;
    static long population; 

    static void msg() {
        System.out.println("how are you doing.");
//      System.out.println(this.wheels);  // can't use this over here.
    }

    public Car(String name, int wheels, boolean isDriverless) {
        this.name = name;
        this.wheels = wheels;
        this.isDriverless = isDriverless;
        Car.population += 1;
    }
  
    
}
