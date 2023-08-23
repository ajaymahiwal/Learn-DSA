


public class Inheritance{
    public static void main(String args[]){

        Myself myName=new Myself();  //object of Myself class
        System.out.println();
        Cousin cousinName=new Cousin(); //object of cousinName class
    }
}
//Parents 
class DadaJii{
    DadaJii(){
        System.out.println("i am your DadaJii.");
    }
}
//child
class PapaJii extends DadaJii{
    PapaJii(){
        System.out.println("i am your PapaJii.");
    }
}
//child
class Uncle extends DadaJii{
    Uncle(){
        System.out.println("i am your Uncle.");
    }
}
//child's child(of PapaJii)
class Myself extends PapaJii{
    Myself(){
        System.out.println("i am i.");
    }
}
//child's child (of Uncle)
class Cousin extends Uncle{
    Cousin(){
        System.out.println("i am your Cousin.");
    }
}