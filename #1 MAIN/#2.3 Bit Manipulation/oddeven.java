

import java.util.*;
public class oddeven{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        int bitmask=1;

        if((n & bitmask) == 0){
            System.out.println(n+" is EVEN.");
        }
        else{
            System.out.println(n+" is ODD.");
        }
    }
}