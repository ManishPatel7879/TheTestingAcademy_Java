package Java;

import java.util.Scanner;

public class RealTimeBrowserAutomation_Switch {

    static void main(String[] args) {
        //Web Automation
        //I want the input from user which browser want to run test cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser name, Which you want to start !!");
        String web = scanner.next();
        web = web.toLowerCase();              // this will remove case sensitivity and if user enter Chrome then also it will display the result.

        switch (web){

            case "chrome" :           // user have to enter same keyword chrome in small letters otherwise it failed becasue of case sensitivity so to remove case sensitivity we use lowercaser function. above
                System.out.println("Starting Chrome Browser");
                break;
            case "firefox" :
                System.out.println("Starting Firefox Browser");
                break;

            case "Edge" :
                System.out.println("Starting Edge Browser");
                break;

            default:
                System.out.println("I donot know which browser is this.");
        }


    }


}
