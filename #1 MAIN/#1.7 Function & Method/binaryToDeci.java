

//BINARY TO DECIMAL

import java.util.*;
import java.lang.Math;
public class binaryToDeci{
    public static int binaToDeci(int num){
        int pow=0,decimal=0,last;
        while(num>0){
            last=num%10;
            num=num/10;
            decimal=decimal+(int)(last*Math.pow(2,pow));
            pow++;
        }
        return decimal;


    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);


        System.out.println("Enter a number:");
        int a=s.nextInt();
        System.out.println("ANSWER: "+ binaToDeci(a) );


    }
}