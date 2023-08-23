
//Date 12-07-23
import java.util.*;
public class Reverse{
//Time Complexity: O(half of digits of num) =  O((log10+1)/2)
//Divide And Conquer Approach
    public static void reverse(int num){
        int size = (int) Math.log10(num)+1;
        int mid = size/2;
        // System.out.println(size);
        int firstP=0,secondP=0;
        if(size%2==0){
            firstP = num / (int) Math.pow(10,mid);
            secondP = num % (int) Math.pow(10,mid);
        }
        else{
            firstP = num / (int)Math.pow(10,mid+1);
            secondP = num % (int)Math.pow(10,mid+1);
        }
        int newSecP = 0, newFirP = 0;
        while(firstP>0 || secondP>0){
            int remi_1 = firstP%10;
            newSecP = newSecP * 10 + remi_1;
            firstP/=10;

            int remi_2 = secondP%10;
            newFirP = newFirP * 10 + remi_2;
            secondP/=10;
        }

        System.out.println(newFirP);
        System.out.println(newSecP);
        int result=0;
        if(size%2==0){
             result = newFirP * (int)Math.pow(10,mid) + newSecP;
        }
        else{
            result = newFirP * (int)Math.pow(10,mid+1) + newSecP;
            result/=10;
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        int num = 23451;
        reverse(num);
    }
}