package Java;

import javax.swing.*;
import java.util.Scanner;

public class Day5_SwitchStatement_1 {
    static void main(String[] args) {
        //take a input from user and tell them which number hold which day
        //eg. 1- monday, 2-tuesday .....7-> sunday

        Scanner scnanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int day = scnanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednessday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not Allowed");
        }


    }

}
