package PracticeJava;

import java.util.Scanner;

public class Assignment6_PalindromChecker_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word or phrase:");
        String s = scanner.nextLine();

        // Clean the string: remove non-alphanumeric characters and convert to lowercase
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reverse = new StringBuilder(clean).reverse().toString();

        // Compare
        if (clean.equals(reverse)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is NOT a palindrome.");
        }
    }
}
