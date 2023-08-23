


public class Statickeyword{

      
    //EXECUTE BEFORE MAIN METHOD AT THE TIME OF CLASSLOADING 
  static{System.out.println("hiiiiii i am static block");}
  
    //A static method can be accessed without creating an object of the class first(public class):
     static void hello(){
        System.out.println("hello world i am static method i am here without any method");
    }
    public static void main(String args[]){

        // Student s1=new Student();
        // Student s2=new Student("Aj",2);
         hello();
        System.out.println("hgddvk ");
        // s2.school="S.D. sr. sec. school";
        // s2.display();
       

    }
}

class Student{

    static String name;
    static int roll_no;     
    static String school="govt. high school"; 

     static void vidyarthi(String na,int roll){
        name=na;
        roll_no=roll;
    }
    //constructor
    Student(){

    }
     Student(String name,int roll){
        // this.name=name;
        // this.roll_no=roll;
    }
    void display(){
    System.out.println(roll_no + " roll no. student name is "+name+" and school name is "+school);
    }

   

}

