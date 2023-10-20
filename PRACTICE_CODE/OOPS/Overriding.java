 

 public class Overriding{
     public static void main(String[] args) {
        Parent parentObj = new Child(); // Parent class object referencing a Child class
        parentObj.displayData(); // Calls the overridden method in the Child class
        // System.out.println(parentObj.data); //can't access by parent obj
        /**
        In Java, a parent class object cannot directly access all the data of a child class because it violates the principle of encapsulation and can lead to potential issues with data integrity and security.
         */

        Parent parentObj1 = new Parent();
        parentObj1.displayData();

        Child ch = new Child(); // Right
        // Child ch = new Parent();  //  Wrong = (error: incompatible types: Parent cannot be converted to Child)
        ch.displayData();
    }
 }

 class Parent {
    public void displayData() {
        System.out.println("Parent class data");
    }
}

class Child extends Parent {
    int data = 10;
    public void displayData() {
        System.out.println("Child class data");
    }
}

