class Animal { }  
class Dog4 extends Animal {  
  static void method(Animal a) {  
       Dog4 d=(Dog4)a;//downcasting  
       System.out.println("ok downcasting performed");  
  }  
   public static void main (String [] args) {  
    // Animal a=new Dog4();  
    // Dog4.method(a);    //DONE
    Animal a = new Animal();
    Dog4.method(a);    //ClassCastException
  }  
}  