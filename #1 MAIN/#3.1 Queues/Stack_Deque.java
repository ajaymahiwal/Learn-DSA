

//implemenation of stack using Deque

import java.util.*;
public class Stack_Deque{
    static class Stack{
        Deque<Integer> d=new LinkedList<>();

        public boolean isEmpty(){
            return d.isEmpty();
        }

        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }
    public static void main(String args[]){
        Stack s=new Stack(); // object of a class name hai queue class ka 
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}