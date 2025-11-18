package Java;

import java.util.Scanner;

public class CheckInputNumber_is_vowel {
public static void main(String[] args){

    // take input from user then check input character is vowle or not
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Single Char");
    char ch = scanner.next().toLowerCase().charAt(0);

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println(ch+ " "+"is Vowel!");


    } else if ( ch>='a' && ch<='z'){
      System.out.println(ch+ " "+"is consonant");

    }else{
        System.out.println("Invalid keyword");
    }



}
}
