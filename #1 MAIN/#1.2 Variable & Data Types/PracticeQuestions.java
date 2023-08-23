//PRACTICE QUESTIONS OF VARIABLE AND DATA TYPES

import java.util.*;
public class PracticeQuestions{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        //QUESTION 1
        // System.out.println("QUESTION 1");
        // float A,B,C,avg;
        // System.out.println("ENTER 3 NUMBER & GET AVERAGE");
        // A=s.nextFloat();
        // B=s.nextFloat();
        // C=s.nextFloat();
        // avg=(A+B+C)/3;
        // System.out.println("AVERAGE :"+avg);




        //QUESTION 2
        // System.out.println("QUESTION 2");
        // float side;
        // System.out.println("ENTER THE SIDE OF SQUARE & GET AREA:");
        // side=s.nextFloat();
        // System.out.println("AREA OF SQUARE:"+ (side*side));





        //QUESTION 3
        /*System.out.println("QUESTION 3");
        float pen,pencil,eraser,cost,GST;
        System.out.println("ENTER THE COST OF PEN:");
        pen=s.nextFloat();
        System.out.println("ENTER THE COST OF PENCIL:");
        pencil=s.nextFloat();
        System.out.println("ENTER THE COST OF ERASER:");
        eraser=s.nextFloat();
        cost=pen+pencil+eraser;
        GST=(cost*18)/100;  //GST rate 18% & ALTERNATE METHOD: (0.18f*cost)
        System.out.println("TOTAL COST WITHOUT GST:"+cost);
        System.out.println("TOTAL COST WITH GST:"+(cost+GST));
        */





        //QUESTION 4:WHAT WILL BE TYPE OF RESULT IN THE FOLLOWING JAVA CODE
        /*ANSWER: double (HINT: LOOK AT LARGEST DATA TYPE IN EXPRESSION)
        In the mentioned code, the result variable will be of double type because of type conversion.*/

        /*System.out.println("QUESTION 4");
        byte b=4;
        short sh=512;
        int i=1000;
        char c='a';
        float f=3.14f;
        double d=99.9954;
        double result =(f*b)+(i%c)+(d*sh);
        // float result =(f*b)+(i%c)+(d*sh);
        System.out.println(result);
        */




       //QUESTION 5
        System.out.println("QUESTION 5");
        //Will the following statementgive any error in Java ?
        int $=24;
/* ANSWER

No, the statement will not give any error.
Names of variables are called identifiers in Java. Identifier rule says, identifiers can start with
any alphabet or underscore (“_”) or dollar (“$”).
According to the rule the given variable name is a valid identifier. */

    }
}