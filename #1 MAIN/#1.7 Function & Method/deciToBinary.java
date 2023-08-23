//DECIMAL TO BINARY

import java.util.*;
import java.lang.Math;

public class deciToBinary{

public static int deciToBina(int a){
      int num=a,remainder;
      int pow=0,binary=0;

      while(num>0){
        remainder=num%2;
        num=num/2;
        // binary=binary+(remainder*Math.pow(10,pow));
        binary=binary+(int)(remainder*Math.pow(10,pow));
        pow++;
      }
      return binary;

}

public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int number;
    System.out.println("Enter a number:");
    number=s.nextInt();
    System.out.println("Converting decimal into binary");
    System.out.println(number+" in Binary form "+ deciToBina(number));


     //CALLING A FUNCTION USING A OBJECT

     // deciToBinary obj=new deciToBinary();
     // System.out.println(number+" in Binary form "+ obj.deciToBina(number));
}

}