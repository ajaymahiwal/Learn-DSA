

//FACTORIAL 

import java.util.*;
public class factorial{

    public static int fact(int num){
      if(num==0 || num==1){
         return 1;
      }
      else{
        return num*fact(num-1);
      }
      
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        int num;
        System.out.println("Enter a number:");
        num=s.nextInt();
        System.out.println("Factorial of "+num+" is :" + fact(num));
    }
}
