package Java;

public class Day2_LocalVariable {
    public static void main(String[] args) {

        int a = 10;                                //this is local variable

        {

            int b = 20;                             // this is local variable but limit is within the {}
            System.out.println(b);
        }

        int b = 30;                                  // this is also local variable
        System.out.println(b);

        System.out.println(a);


    }


}
