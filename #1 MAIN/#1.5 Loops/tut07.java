//CHECK IF A NUMBER IS PRIME OR NOT

import java.util.*;
public class tut07{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
        int number,count=0;

        System.out.println("Enter a number to prime or not: ");
        number=s.nextInt();
      /*
       for(int i=1;i<=number;i++){
        if(number%i==0){
            count++;
        }
       }
       if(count==2){
        System.out.println(number+" is a prime number.");
       }
       else{
        System.out.println(number+" is not a prime number.");

       }
       */
       
       if(number==2){
         System.out.println("Number is Prime.");
       }
    else{
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        
       if(isPrime==true){
        System.out.println("Number is Prime.");
       }else{
        System.out.println("Number is Composite.");
       }
    }




    }
}