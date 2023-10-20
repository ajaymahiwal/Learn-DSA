//Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.

import java.util.*;
public class PrintBinary{
    public static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n>0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
            n--;
        }
        System.out.println(q);
    }

    public static void main(String args[]){
        generateBinary(5);
// 1
// 10
// 11
// 100
// 101
// [110, 111, 1000, 1001, 1010, 1011]
    }
}