
//Queue Reverseal 
//TC => O(n)  Sc=> O(n)
import java.util.*;
public class Question_3{
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        System.out.println(q);
    // [8, 7, 6, 5, 4, 3, 2, 1]
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

        queueReversal(q1);
    }
}