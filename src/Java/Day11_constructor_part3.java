package Java;




public class Day11_constructor_part3 {
    static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";              // if we are giving name this type then name of car is changed to tesla

        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);


    }

   static class Car {

        String name;
        int year;
        String model;

        //Default Constructor

        Car() {
            name = "Unknown car";
            year = 2021;
            model = "xxx";
        }

    }


}
