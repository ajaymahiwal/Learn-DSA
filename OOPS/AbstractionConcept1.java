

public class AbstractionConcept1{
    public static void main(String args[]){
        Bank name = new SBI();
        name.welcome();
        System.out.println("Interest Rate in this Bank is:"+ name.interestRate());

        name = new ICIC();
        name.welcome();
        System.out.println("Interest Rate in this Bank is:"+ name.interestRate());

        name = new PNB();
        name.welcome();
        System.out.println("Interest Rate in this Bank is:"+ name.interestRate());
    }
}

abstract class Bank{
    Bank(){
        System.out.println("Bank class Constructor.");
    }
    void welcome(){
        System.out.println("Welcome TO DIGITAL BANKING System....");
    }
    abstract float interestRate();
}

class SBI extends Bank{
    void welcome(){
        System.out.println("WELCOME TO SBI");
    }
    float interestRate(){
        return 7.8f;
    }
}
class ICIC extends Bank{
    void welcome(){
        System.out.println("WELCOME TO ICIC");
    }
    float interestRate(){
        return 8f;
    }
}
class PNB extends Bank{
    void welcome(){
        System.out.println("WELCOME TO PNB");
    }
    float interestRate(){
        return 6f;
    }
}
