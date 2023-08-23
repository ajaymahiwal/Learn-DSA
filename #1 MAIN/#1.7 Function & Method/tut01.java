

//BASIC OF METHODS

public class tut01{
    //method-1
    public static void method1(){
        System.out.println("I am Method-1");
    }

    //method-2
    void method2(){
        System.out.println("I am Method-2");
    }

    public static void main(String args[]){
//WE CAN CHOOSE ANY METHOD CALLING RULE,WE USE METHOD-1 MOST OF TIME ACCRODING TO OUR CHOICE 

    //calling method-1
    method1();

    //calling method -2
    
    //SYNTAX:  fileName objName=new fileName();
    tut01 obj=new tut01();
    obj.method2();  

    }
}