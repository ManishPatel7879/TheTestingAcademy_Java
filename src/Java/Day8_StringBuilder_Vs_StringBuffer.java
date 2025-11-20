package Java;

public class Day8_StringBuilder_Vs_StringBuffer {

    static void main(String[] args) {

//        String a ="Manish";                  //first way to create string via assignment operator
//        String b = new String("Deepak");         //second way to create string via new object or new keyword
//        StringBuffer stringbuffer = new StringBuffer("Radhika");         // thired way to create string via string buffer
//        StringBuilder stringBuilder = new StringBuilder("Mayra");         //fourth way to create string via string builder


        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");                               //append means will add at the end.
        System.out.println(stringBuffer);

       StringBuilder stringBuilder = new StringBuilder("Manish");
       stringBuilder.append(123);
        System.out.println(stringBuilder);
        System.out.println("Reverse of stringBuilder :- "+ stringBuilder.reverse());



    }
}
