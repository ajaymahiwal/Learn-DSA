

import java.util.*;
public class largeststring{
    public static void largest(String name[]){

        String large=name[0];  //suppose name[0] is larger string just imagine
        for(int i=0;i<name.length;i++){
            if(large.compareTo(name[i])<0){
                large=name[i];
            }
        }
        System.out.println("Largest String in this:\""+large+"\"");
    }
    public static void main(String args[]){
     /*   Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        String name[]=new String[num+1];   //num    1 2 3 4 5 
        for(int i=0;i<name.length;i++){    //index  0 1 2 3 4  isliye num+1 kiya hai
            name[i]=s.nextLine();
        }
        // System.out.println("Entered strings are:");
        // for(int i=0;i<name.length;i++){
        //     System.out.println(name[i]);
        // }

        largest(name); */

    
            //BY MICROSOFT WALI DIDI
        String fruits[]= {"apple", "mango", "banana"};

        String largest=fruits[0];
            for(int i=1; i<fruits.length; i++) {
                if(largest.compareTo(fruits[i])<0) {
                   largest = fruits[i];
                }
            }
        System.out.println("Largest String in this:\""+largest+"\"");

    
     
    
    }
}