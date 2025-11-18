package Java;

public class While_Loop {

    public static void main (String [] args){

        // if you want to initilize the variable or value outside of loop then you can use while loop
        // if you want to initilize the value on same line then you can use for loop . both almost same

        int i= 0 ;
        while( i<50){
System.out.println(i);
i++;
        }

        for (int j = 0; j<50; j++){
            System.out.println(j);
        }

    }
}
