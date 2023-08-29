
// import java.util.Deque;
// import java.util.LinkedList;
import java.util.*;
public class UsingDequeStack{
    //Every Method have Time Complexity O(1)
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}