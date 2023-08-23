//SUM OF a & b (INPUT FROM USER)

import java.util.*;

public class tut10{
    public static void main(String args[]){

    int a,b,sum;

    Scanner s= new Scanner(System.in);
    System.out.println("ENTER TWO NUMBERS:");
    a=s.nextInt();
    b=s.nextInt();
    sum=a+b;
    System.out.println("SUM OF a & b:"+sum);

    }
}