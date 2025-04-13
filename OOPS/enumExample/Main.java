package Java_Bootcamp.OOPS.enumExample;

public class Main {
    enum Week {
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Contructor is called: " + this);
        }
    }

    public static void main(String[] args) {
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}


 