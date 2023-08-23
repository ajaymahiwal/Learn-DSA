

//Instance Initilizer Block

public class IIB{

    IIB(){
        System.out.println("I Am Constructor.");
    }
    //IIB-1
    {
        System.out.println("IIB-1");

    }
    {
        System.out.println("IIB-2");

    }
    public static void main(String args[]){

        IIB obj = new IIB();
    }
}