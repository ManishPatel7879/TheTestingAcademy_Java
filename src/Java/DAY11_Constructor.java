package Java;

class Cat {                          // Class outside main
    String name;

    // Default Constructor
    //Defualt Constructor is to initialize the value of member variable.
    Cat() {
        System.out.println("Cat object created");
    }

    void running() {
        System.out.println("Running");
    }
}

public class DAY11_Constructor {
    public static void main(String[] args) {

        Cat c1 = new Cat();          // Creating object → constructor will run
        c1.running();                // Calling method

        Cat c2 = new Cat();          // Another object
        c2.running();
    }
}
