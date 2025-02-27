package Java_Bootcamp.Basics;

public class countNumOfDays {

    static int countDays(int n) {

        int days = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println("Hey Santu, you can go ouside");
                days++;
            }
            
        }
        return days;

    }

    public static void main(String[] args) {
        int n = 30;

        System.out.println("This is August month.\n");

        int result = countDays(n);
        System.out.println("\nNumber of days you have gone: " + result);
        
    }
    
}



