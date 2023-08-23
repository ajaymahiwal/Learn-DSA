/*
https://www.programiz.com/java-programming/linkedlist
 */

import java.util.*;
public class AAlreadyDefined{
    public static void main(String args[]){
        LinkedList<Integer> number=new LinkedList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println(number);
        // number.remove(2);
        number.removeFirst();
        
        System.out.println(number);
        number.set(2,10);
        System.out.println(number);
        System.out.println(number.get(2));
    }
}