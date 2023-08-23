


/**
Let's see the real use of super keyword. Here, Emp class inherits Person class so all the properties of Person will be inherited to Emp by default. To initialize all the property, we are using parent class constructor from child class. In such way, we are reusing the parent class constructor.
 */
public class KeyWordSup{
    
    KeyWordSup(){
        System.out.println("I am Parent Class my name is KeyWordSup.");
    }
    
    public static void main(String args[]){
        Programmer p1 = new Programmer(1,"Ajay",20,50000);
        Programmer p2 = new Programmer(1,"Aman",28,50000);
        p1.showDetails();
        p2.showDetails();
    }
}

class Employee{
    int id;
    String name;
    int age;

    Employee(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void showInfo(){
        System.out.println("ID "+id+" "+name+" age"+age);
    }
}

class Programmer extends Employee{
    int salary;

    Programmer(int id,String name,int age,int salary){
        super(id,name,age); //reusing parent constructor  
        this.salary=salary;
    }

    void showDetails(){
        System.out.println("Salary is:"+ salary);
        super.showInfo();
    }
}





/**

public class KeyWordSup{
    
    KeyWordSup(){
        System.out.println("I am Parent Class.");
    }
    KeyWordSup(int a){
        System.out.println("I am Parent Class,But Not Default");
    }
    public static void main(String args[]){
        Testingg ts = new Testingg();
    }
}

class Testingg extends KeyWordSup{
    // Super(); // error: invalid method declaration; return type required
    Testingg(){
//call to super must be first statement in constructor

        super(10);// ager ye define nhi kiya hota to compiler by default , defalut constructor ko hi call lga deta 
        System.out.println("I Am child Class.");
    }
}



 */