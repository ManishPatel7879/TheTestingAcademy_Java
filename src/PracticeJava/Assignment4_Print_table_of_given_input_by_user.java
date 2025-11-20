package PracticeJava;

import java.util.Scanner;

//prg: take input from user and print the table of that input



public class Assignment4_Print_table_of_given_input_by_user {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of which you want to print the table ->");
        int a = scanner.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", a, i, i*a );
        }


    }

}
