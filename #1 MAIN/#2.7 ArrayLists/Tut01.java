


import java.util.*;
public class Tut01{
    public static void main(String args[]){

        ArrayList<String> studentNames=new ArrayList<String>();
        studentNames.add("Ajay");
        studentNames.add("Gargi"); 
        studentNames.add("Aman"); 

        // studentNames.add(0,"gg");
        
        int n=studentNames.size();
        // System.out.println(n);

        ArrayList<Integer> marks=new ArrayList<Integer>();

        marks.add(100);
        marks.add(80);
        marks.add(63);
        marks.add(98);
        marks.add(65);

        Collections.sort(marks); //Asending order
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());  //Desending order
        System.out.println(marks);
    }
}