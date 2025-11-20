package Java;

public class Day10_OPPS_Class_Objects_personClass {    // Person class

    // Below are the attributes / properties / instance variables
    String name;
    int age;
    String gender;
    String height;
    Boolean is_married;

    // Below are behaviour / methods
    void walk(){
        System.out.println(name + " is Walking");
    }

    void sing(){
        System.out.println(name + " is Singing");
    }

    void eat(){
        System.out.println(name + " is Eating");
    }

    // Main method to create objects
    public static void main(String[] args) {

        // Creating an object of the class
        Day10_OPPS_Class_Objects_personClass person1 = new Day10_OPPS_Class_Objects_personClass();

        // Assign values to person1
        person1.name = "Manish";
        person1.age = 28;
        person1.gender = "Male";
        person1.height = "5.7 ft";
        person1.is_married = false;

        // Calling methods
        person1.walk();
        person1.sing();
        person1.eat();
    }
}
