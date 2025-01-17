package Java_Bootcamp.OOPS.interfaces;

public class Car implements Engine, Break, Media {

    @Override
    public void start() {
        System.out.println("i start like a normal car.");
 
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car.");
 
    }

    @Override
    public void acc() {
       System.out.println("i accelarate like a normal car.");

    }
 

   
    
}  
