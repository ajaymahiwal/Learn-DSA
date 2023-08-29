

//Double Ended Queue

import java.util.Deque;
import java.util.LinkedList;
public class DequeJava{
    public static void main(String args[]){
        // Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> deq1 = new LinkedList<>();

        deq1.addFirst(10);
        deq1.addFirst(10);
        deq1.addFirst(10);

        System.out.println(deq1);
    }
}