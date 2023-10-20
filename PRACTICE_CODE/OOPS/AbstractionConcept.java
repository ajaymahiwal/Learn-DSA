

public class AbstractionConcept{
    public static void main(String args[]){
        // Animal a= new Dog();
        // a.speak();
    }
}

abstract class Animal{
    abstract void speak();
    // {
        // abstract methods cannot have a body
    // }
}

abstract class Dog extends Animal{
    // abstract void speak();
    
}