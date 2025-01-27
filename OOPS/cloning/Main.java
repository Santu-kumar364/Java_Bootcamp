package Java_Bootcamp.OOPS.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human santu = new Human(20, "santu");
        //Human twin = new Human(santu);
    
        Human twin = (Human)santu.clone();
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100; // modifying the value

        System.out.println(Arrays.toString(twin.arr)); // original value is also changed  
        System.out.println(Arrays.toString(santu.arr));

        
    }



    
}
