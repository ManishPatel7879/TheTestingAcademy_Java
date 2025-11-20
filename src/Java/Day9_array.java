package Java;

import java.util.Arrays;

public class Day9_array {
    static void main(String[] args) {

        int[] marks = {10, 20, 56, 59, 65};         //first way to declare array
        int[] marks2 = new int[2];                 //second way is fixed length
        System.out.println(Arrays.toString(marks));

        String[] names1 = {"pramod", "amit", "manish"};  // this is called one dimensional array
        System.out.println(names1.length);            // length of array start with 1 and index start with 0

        String[] names = new String[3];            // string array : it can contains 3 name
        names[0] = "Manish";
        names[1] = "Ram";
        names[2] = "Mayra";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

boolean[] is_male_data = new boolean[2];
is_male_data[0] = true;
is_male_data[1] = false;



    }
}
