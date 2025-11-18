package Java;

public class Print_Odd_Number {
    public static void main (){

        for (int i=0; i<50; i++){
            if (i%2==0){
                continue;
            }
            System.out.println("Odd Numbers ->" + i);
        }

    }
}
