

class A{

}
class B{

}

class c extends A,B{

}


public class TestMulti{
    public static void main(String args[]){
        System.out.println("Hello Program Running Fine......");
    }
}

/**

TestMulti.java:10: error: '{' expected
class c extends A,B{
                 ^
1 error

 */