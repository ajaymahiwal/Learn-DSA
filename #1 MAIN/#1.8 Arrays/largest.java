

//FINDING LARGEST AND SMALLEST IN ARRAY

import java.util.*;
public class largest{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num,large,small;
        int numbers[]=new int[20];
        System.out.print("How many number you want to enter :");
        num=s.nextInt();
        System.out.println("Enter numbers one by one:");
        for(int i=0;i<num;i++){
            numbers[i]=s.nextInt();
        }
        // large=numbers[0];
        large=Integer.MIN_VALUE;  //  -INFINITY ALREADY DEFINED IN JAVA UTIL PACKAGE
        for(int i=0;i<num;i++){
            if(large<numbers[i]){
                large=numbers[i];
            }
        }
        
        System.out.println("Largest number is: "+ large);


        // large=numbers[0];
        small=Integer.MAX_VALUE;  //  +INFINITY ALREADY DEFINED IN JAVA UTIL PACKAGE
        for(int i=0;i<num;i++){
            if(small>numbers[i]){
                small=numbers[i];
            }
        }
        System.out.println("Smallest number is: "+ small);

    }
}