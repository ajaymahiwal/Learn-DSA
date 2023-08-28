
//Interleves two Halves of a Queue (Even Length)
//TC => O(n)  Sc=> O(n)

import java.util.*;
public class Question_2{
    public static void  interleves2Halves(Queue<Integer> q1){
        int mid = q1.size()/2;
        Queue<Integer> q2 = new LinkedList<>();
        while(mid>0){
            q2.add(q1.remove());
            mid--;
        }

        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        System.out.println(q1);
    //[1, 5, 2, 6, 3, 7, 4, 8]
    }
    public static void main(String args[]){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);

        interleves2Halves(q1);
        while(!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }
    //1 5 2 6 3 7 4 8 
    }
}