package Java;

import java.util.Scanner;

public class SwitchCase_checkvowle {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a single char: ");
    char ch = scanner.next().toLowerCase().charAt(0);
            switch (ch){
                case 'a', 'e', 'i', 'o',  'u' -> System.out.println("vowel");
                default -> System.out.println("consonant");
        }

    }

}
