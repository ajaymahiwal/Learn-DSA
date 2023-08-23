//INPUT IN JAVA


import java.util.*;   //package java.util

/*  Scanner is a class of package java.util.
    s is a object we can take any name but practice with one name
    .next() ,.nextLine() etc.  ye sab methods hai
*/

public class tut09{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);   
        System.out.println("ENTER NAME:");
        // String name1=s.next();     
        // System.out.println("using next() method:"+name1);

        /* METHOD next() space k baad ko IGNORE KERTA HAI isliye iska kamm kamm se use kerna hai vse hum escape sequence bhi use ker skte haai
        */
        String name2=s.nextLine();
        System.out.println("using nextLine() method:"+name2);


        System.out.println("ENTER YOUR AGE");
        byte age=s.nextByte();
        System.out.println("YOUR AGE IS:"+ age);


        int a,b;
        a=s.nextInt();
        b=s.nextInt();
    }
}