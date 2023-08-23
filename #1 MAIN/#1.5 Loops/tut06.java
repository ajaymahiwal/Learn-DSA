//QUESTION ON BREAK AND CONTINUE

import java.util.*;
public class tut06{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        //BREAK QUESTION
        //KEEP ENTERING NUMBER TILL USER ENTERS A MULTIPLE OF 10
        int number;
        System.out.println("BREAK QUESTION");

        do{
            System.out.println("enter number");
            number=s.nextInt();
            if(number%10==0){
                break;
            }

        }while(true);
        System.out.println("YES,Now you entered multiple of 10");

        System.out.println();
        System.out.println();


        //CONTINUE QUESTION
     //DISPLAY ALL VALUES ENTERED BY USER EXCEPT MULTIPLE OF 10 (BUS 10 KA MULTIPLE PRINT NA HO)

        int value;
        System.out.println("CONTINUE QUESTION");
        do{
            System.out.println("enter number");
            value=s.nextInt();
            if(value%10==0){
                continue;
            }
            System.out.println("your entered value : "+value);
        }while(true);

    
       




    }
}