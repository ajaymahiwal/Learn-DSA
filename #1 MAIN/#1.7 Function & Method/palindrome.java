

//CHECK WHEATHER A NUMBER IS PALINDROME OR NOT
import java.util.*;
public class palindrome{
    public  static void palindrome_number(int num){
         int n=num;
         int reverse=0,last;
        while(num>0){
            last=num%10;
            num=num/10;
            reverse=reverse*10 +last;
        }
        if(n==reverse){
            System.out.println(n+" is Palindrome.");
        }
        else{
            System.out.println(n+" is Not Palindrome.");
           
        }

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=s.nextInt();
        palindrome_number(num);
    }
}