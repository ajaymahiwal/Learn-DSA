


public class Polymorphism{
    public static void main(String args[]){

        //method overloading
        Calculaor adder=new Calculaor();
        // System.out.println( adder.addingCalculator(5.6f,5.4f) );
        System.out.println( adder.addingCalculator(5,10,25,10) );

        //method overriding
        IPhone_14_Max i=new IPhone_14_Max();
        Galaxy_S22 g=new Galaxy_S22();
        OnePlus o=new OnePlus();
        System.out.println(i.camra());
        System.out.println(g.camra());
        System.out.println(o.camra());
    }
}

class Calculaor{
    //METHOD  OVERLOADING
    int addingCalculator(int a , int b){
        System.out.println("1st");
        return a+b;
    }
    int addingCalculator(int a , int b, int c, int d){
        System.out.println("2nd");
        return a+b+c+d;
    }
    float addingCalculator(float a , float b){
        System.out.println("3rd");
        return a+b;
    }
    float addingCalculator(float a , float b ,int c, float d){
        System.out.println("4th");
        return a+b+c+d;
    }   
}


//METHOD OVERRIDING :
// method ka naam,parameter same lekin defination yani implemention(code) alag hai koi kuch print kerva rha to kuch
class SmartPhone{
    int camra(){
        System.out.println("Camra Quality Comparison");
     return 0;}
}

class IPhone_14_Max extends SmartPhone{
    int camra(){
        System.out.println("I have 48 MP camra.");
     return 0;}
}

class Galaxy_S22 extends SmartPhone{
    int camra(){
        System.out.println("I have 108 MP camra.");
     return 0;}
}

class OnePlus extends SmartPhone{
    int camra(){
        System.out.println("I have 108 MP camra.");
     return 0;}
}

