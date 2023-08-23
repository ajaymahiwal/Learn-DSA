//ARRAYS AS FUNCTION ARGUMENT

//ager hum kisi method m array ki value change ker de to vo main method m bhi change ho jaye ge

import java.util.*;
public class tut03{
    public static void update(int num[]){

        for(int i=0;i<num.length;i++){
            num[i]=num[i]+10;  
        }

    }
    public static void main(String args[]){
     Scanner s=new Scanner(System.in);
        int marks[]={50,70,80,99};
        // int marks[]=new int[7];
        // System.out.println(marks.length);

        // for(int i=0;i<marks.length;i++){
        //     marks[i]=s.nextInt();
        // }
        update(marks); 
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}