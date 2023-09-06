


public class KeyWordThis{
    KeyWordThis getA(){
        System.out.println(this);
        return this;
    }
     void msg(){
        System.out.println("I have a message for you.");
    }
    public static void main(String args[]){
        // Car c = new Car();
        // new KeyWordThis().getA();
        System.out.println(new KeyWordThis().getA());
    }
    
}
class ElecCar{
    Car obj1;
    ElecCar(Car obj){
        obj1=obj;
    System.out.println(obj1.price);
    }
}
class Car{
    int price=100;

    Car(){
        ElecCar ec = new ElecCar(this);
    }
}

/**
KeyWordThis(){
        this(10); //call to this must be first statement in constructor
        System.out.println("Hello i am Default (NonPara) Constructor");
    }
    KeyWordThis(int a){
        System.out.println("Hello i am Para Constructor");
    }
    public static void main(String args[]){
        KeyWordThis obj = new KeyWordThis();
    }
 */