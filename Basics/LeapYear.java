package Java_Bootcamp.Basics;
import java.util.Scanner;
public class LeapYear {
    static boolean check(int year) {
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
            
        System.out.println(check(year));
        }
    }
}



















