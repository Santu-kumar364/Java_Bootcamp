package Java_Bootcamp.OOPS.enumExample;

public class Main {
    enum Week {
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this);
        }
    }

    public static void main(String[] args) {


        Week week;
        week = Week.Thrusday;

        /*for(Week day : Week.values()) {
            System.out.println(day);

        }*/

        System.out.println(week.ordinal());
        
    }
    
}



