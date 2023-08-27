

// add - O(n)
// remove - O(1)
// peek - O(1)
// isEmpty - O(1)

import java.util.*;
public class QueueUsingStack_2{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){ //O(1)
            return s1.isEmpty();
        }

        public static void add(int data){ //O(1)
            s1.push(data);
        }
        public static int remove(){ //O(n)
            if(isEmpty()){
                System.out.println("Already Empty Queue");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

           int front = s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return front;
        }
        public static int peek(){  //O(n)
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

           int front = s2.peek();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return front;
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(5);
        q.add(10);
        q.add(7);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        //1 5 10 7
    }
}