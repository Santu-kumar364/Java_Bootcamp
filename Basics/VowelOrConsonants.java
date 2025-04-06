package Java_Bootcamp.Basics;

import java.util.Scanner;

public class VowelOrConsonants {

    public static void main(String[] args) {

        String vowels = "aeiou";
        

        Scanner sc = new Scanner(System.in);
        char letter = sc.next().toLowerCase().charAt(0);
        
        if(vowels.indexOf(letter) != -1) {
            System.out.println("vowels");
        }
        else if(letter >= 'a' && letter <= 'z') {
            System.out.println("consonants");
        }
        else {
            System.out.println("Invalid input. please enter an alphabet.");
        }

        sc.close();

    }
    
}


  
