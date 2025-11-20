package Java;

public class Day5_Array {
    public static void main (String[] args){

        int [] a = {10, 20, 30, 40, 50};     //length of array is 5 but index 0 to 4

        System.out.println(a[3]);           // print single array of index 3
        System.out.println(a[4]);

        // now to print all values of an array we will use for loop

        for (int b : a ){

            System.out.print(  b + " ");
        }
    }
}
