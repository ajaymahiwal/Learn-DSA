class Superclass {
    int num=100;
    public static void display() {
        System.out.println("Superclass static method");
    }
    public void display1() {
        System.out.println("Superclass static method");
    }
}

class Subclass extends Superclass {
    int num=200;
    public static void display() {
        System.out.println("Subclass static method");
    }
    public void display1() {
        System.out.println("Subclass static method");
    }
}

public class Runtime1 {
    public static void main(String[] args) {
        System.out.println("------ Method Hiding ------ beacause method are static");
        // Superclass obj1 = new Superclass();
        Superclass obj2 = new Subclass();  // Upcasting

        // obj1.display(); // Output: "Superclass static method"
        obj2.display(); // Output: "Superclass static method"

        Subclass obj3 = new Subclass();
        
        obj3.display();

        System.out.println("------ Method Overriding ------ beacause method are non-static");
        // obj1.display1();
        obj2.display1();
        obj3.display1();
        

        System.out.println("------ Data Member Hiding ------");
        // System.out.println(obj1.num);
        // System.out.println(obj2.num);
        System.out.println(obj3.num); // if num=200 not declared then 100 will print
    }
}
