


public class Constructors{
    public static void main(String args[]){

        // Student s1=new Student();  //NON-PARAMERTRIZED CONSTRUCTORS
        // s1.age=8;
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // Student s2=new Student("Ajay",19); //PARAMERTRIZED CONSTRUCTORS
        // System.out.println(s2.age);

        University a1=new University();
        a1.name="Shodi";
        a1.age=40;
        a1.salary[0]=10;
        a1.salary[1]=50;
        a1.salary[2]=180;

        University a2=new University(a1);  //copy  a2 = copy of a1
        a1.salary[2]=22; 
        // System.out.println(a2.name);
        for(int i=0;i<3;i++){
        System.out.println(a2.salary[i]);
        }


    }
}

class University{
    String name;
    int age;
    int salary[]=new int[3];

    University(){

    }

    University(University a1){
        this.name=a1.name;
        this.age=a1.age;
        // this.salary=a1.salary;
        for(int i=0;i<3;i++){
            this.salary[i]=a1.salary[i];
        }
    }
}


class Student{
    String name;
    int age;
    int marks[]=new int[3];
    
    Student(){
        System.out.println("i am non-parametrized");
    }
    Student(String names,int ag){
        this.name=names;
        this.age=ag;
    }
}