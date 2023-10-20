

public class KeyWordStatic{
    int a=10;
 public static void test(){
    System.out.println(" I Am Test Method ....");
    // a=20;
//  error: non-static variable a cannot be referenced from a static context
}

public void test1(){
    System.out.println(a);
}
    public static void main(String args[]){
        Student s1=new Student("Ajay",1);
        Student s2=new Student("Mahi",2);
        Student s3=new Student("Aman",3);
        //we can change the college of all objects by the single line of code  
        //Student.collegeName="GJU Hisar";  
        s1.display();
        s2.display();
        s3.display();

        s1.changeCollegeName1(); //static method
        // s1.changeCollegeName();  //static method

        s1.display();
        s2.display();
        s3.display();

        // Student.changeCollegeName();
        KeyWordStatic.test();
//A static method can be invoked without the need for creating an instance of a class.

        // System.out.println(KeyWordStatic.a); // a is non static variable
        // System.out.println(a); //non static data member
        KeyWordStatic obj = new KeyWordStatic();
        obj.test1();
    }
}

class Student{
    
    int id;
    String name;
    // String collegeName="OSGU"; //will get memory each time when the instance is created  
    static String collegeName="OSGU"; // static variable

    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    void display(){
        System.out.println(id+" "+name+" "+collegeName);
    }

    void changeCollegeName1(){
        collegeName="OM Sterling Global University";
        id=5;
    }
    static void changeCollegeName(){
        collegeName="OM Sterling Global University";
        // id=5;
//error: non-static variable id cannot be referenced from a static context
    }
}