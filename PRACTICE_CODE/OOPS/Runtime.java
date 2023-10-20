

public class Runtime{
    public static void main(String args[]){  
    Bike obj=new Honda3();  
    Bike obj1=new Bike();  
    // System.out.println(obj.speedlimit);//90  
    obj.hello();
    // Honda3 obj1 = new Honda3();
    // System.out.println(obj1.speedlimit);
    obj1.hello();
}
}

// Rule: Runtime polymorphism can't be achieved by data members.
    class Bike{  
        int speedlimit=90;
        Bike(){
            // System.out.println("Parent");

        }
        public static void hello(){
            System.out.println("I am Hello Method of parent");
        }
}  
    class Honda3 extends Bike{  
        int speedlimit=150;  
        Honda3(){
            // System.out.println("child");
        }
        public static void hello(){
            System.out.println("I am Hello Method of child");
        }
  
}  