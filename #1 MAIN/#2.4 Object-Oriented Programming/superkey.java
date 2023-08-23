


public class superkey{
    public static void main(String args[]){

        Student s2=new Student();
        System.out.println("marks excussed from School is : "+s2.marks);
        System.out.println("marks excussed from School is : "+s2.m);
        s2.playing();
    }
}

class School{
    School(){
        // System.out.println("i am School construcor");
    }
    int marks=100;
    void playing(){
        System.out.println("play cricket");
    }
}

class Student extends School{
    Student(){
        // super();  //ye school constructor ko call ker rha hai iske bina bhi vo call hota hai phle child vale se 
        System.out.println("i am Student construcor");  
    }
    int m=super.marks;// excuss marks from School class
    int n=m-20;

    void games(){
        super.playing();
        System.out.println("student playing");
    }
}