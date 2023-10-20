

public class CopyConstructor{
    public static void main(String args[]){
        Student s1=new Student("Jay",6);
        Student s2=new Student();
        // Student s2=new Student(s1); //By constructor

        // s1.getValue();
        // s2.getValue();

        // By assigning the values of one object into another
        s2.name=s1.name;
        s2.rollNo=s1.rollNo;
        s1.getValue();
        s2.getValue();
        Student obj1 = new Student("ak",42);

        // Using the clone() method
        Student obj2 = (Student) obj1.clone();
        obj2.getValue(); // Output: 42

        // Using the copy constructor
        Student obj3 = new Student(obj1);
        obj3.getValue(); // Output: 42
    }
}

class Student{
    int rollNo;
    String name;

    Student(){

    }
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    Student(Student s1){
        this.name=s1.name;
        this.rollNo=s1.rollNo;
    }

    void getValue(){
        System.out.println("Name of Student:"+name);
        System.out.println("Roll number of student:"+rollNo);
    }
}