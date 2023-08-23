


public class Abstraction{
    public static void main(String args[]){

        

/*CONSTRUCTOR KA KAAM abstract k ander hota hai ki, vo kuch apne child k liye phle se initialize kerde kuch jab tak change nhi kerge vo property jo initlialize ker di thi phle vhi show hogi jab change ker dege to fir new changed value show hogi.*/
        Pnb p=new Pnb();
        p.changeVerify();
        System.out.println(p.verified);
        
        PnbSachaK sk=new PnbSachaK();
        // sk.changeVerify();
        System.out.println(sk.verified);


        // Blackdog bk=new Blackdog();
        //Child ke constructor se phle parent ka constructor execute hoga

        //INTERFACE CONCEPT START FROM HERE
        // Chessboard s=new Chessboard();   //can't create object for base
        Queen q=new Queen();
        q.move();
    }
}

abstract class Bank{
    String verified;
    Bank(){
        verified="verified by RBI";
    }

    void money(){

    }
    abstract void interest();
}

class Pnb extends Bank{
    void changeVerify(){
        verified="Not verified by RBI";
    }
    void interest(){

    }
}

class PnbSachaK extends Pnb{
    void changeVerfiy(){
        verified="Not verified by RBI";
    }
    void interest(){

    }
}


/*CONSTRUCTOR KA KAAM abstract k ander hota hai ki, vo kuch apne child k liye phle se initialize kerde kuch jab tak change nhi kerge vo property jo initlialize ker di thi phle vhi show hogi jab change ker dege to fir new changed value show hogi.*/

abstract class Animal{

    Animal(){
        System.out.println("i am animal constructor");
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("i am Dog constructor");
    } 
}

class Blackdog extends Dog{

    Blackdog(){
        System.out.println("i am Blackdog constructor");
    }
}

//interface concept
interface Chessboard{

    public void move();
      
}

class Queen implements Chessboard{
    // public
    public void move(){
        System.out.println("i am Queen you already know what can i do  haaaha");
    }
}

// class Chotiqueen extends Queen{}