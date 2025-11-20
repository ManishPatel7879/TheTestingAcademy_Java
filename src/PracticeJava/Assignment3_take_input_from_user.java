package PracticeJava;

//prg : take input from user : name and age then print them

import java.util.Scanner;

public class Assignment3_take_input_from_user {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ->");
        String name = scanner.next();

        System.out.println("Enter your age ->");
        int a = scanner.nextInt();

        System.out.println(name + " " + "age" + " " + a);

        scanner.close();


    }

}
