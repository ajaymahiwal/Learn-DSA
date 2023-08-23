

//REVERSE A NUMBER
import java.util.*;
public class reverse{
    public static int reverse_number(int num){
        int reverse=0,last;
        while(num>0){
            last=num%10;
            num=num/10;
            reverse=reverse*10+last;
        }
        return reverse;

    }
    public static void main(String args[]){
        Scanner  s=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=s.nextInt();
        System.out.println("Reverse of "+num+" is:"+reverse_number(num));
        
    }
}