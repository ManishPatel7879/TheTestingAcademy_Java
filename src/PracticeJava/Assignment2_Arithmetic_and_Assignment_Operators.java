package PracticeJava;

import javax.swing.*;
import java.util.Scanner;

//prg : arithmetic and assignment operator



public class Assignment2_Arithmetic_and_Assignment_Operators {
 public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the first number ->");
     int a = scanner.nextInt();
     System.out.println("Please enter the Second number ->");
     int b = scanner.nextInt();
     System.out.println("Choose operation: ");
     System.out.println("1 - Addition");
     System.out.println("2 - Subtraction");
     System.out.println("3 - Multiplication");
     System.out.println("4 - Division");

     System.out.print("Enter your choice -> ");
     int choice = scanner.nextInt();

     int c = 0;

     switch(choice){
         case 1 :

             System.out.println( c = a+b);
             break;

         case 2 :
             System.out.println(c= a-b);
             break;
         case 3:
             System.out.println(c=a*b);
         case 4 :
             System.out.println(c=a/b);




     }





 }



}

