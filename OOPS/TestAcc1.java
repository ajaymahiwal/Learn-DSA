//Real World Example: Account
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  
class Account{  
int acc_no;  
String name;  
float amount; 
//Method to initialize object  
void insert(int acc_no,String name,float amount){
    this.acc_no=acc_no;
    this.name=name;
    this.amount=amount;
}

//deposit method  
void deposit(int money){
    amount+=money;
    System.out.println("Succesfuly Deposited in Account.");
    System.out.println("Current Balance is: "+amount);
}
//withdraw method  
void withdraw(int money){
    if(amount<money){
        System.out.println("Can't withdraw money.");
        System.out.println("Insufficient Balance");  
    }else{
        amount-=money;
        System.out.println("WIthdraw Transaction Completed.");
    }
}
//method to check the balance of the account  
void AccountBal(){
    System.out.println("Account Balance of "+acc_no+" this is : "+ amount);
}
//method to display the values of an object  
void display(){
    System.out.println("Account Number:"+acc_no);
    System.out.println("Account Holder:"+name);
    System.out.println("Account Balance:"+amount);
}
}


//Creating a class to deposit and withdraw amount  
public class TestAcc1{
    public static void main(String args[]){
        Account person1=new Account();
        person1.insert(725000023,"Gargi",2500);
        person1.display();
        System.out.println("-------------------");
        person1.deposit(2500);
        System.out.println("-------------------");
        person1.withdraw(1500);
        System.out.println("-------------------");
        person1.AccountBal();
    }
}