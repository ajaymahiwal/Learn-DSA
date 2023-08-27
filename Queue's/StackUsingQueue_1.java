

// push - O(n)
// pop - O(1)
// peek - O(1)
// isEmpty - O(1)

import java.util.*;
public class StackUsingQueue_1{
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){ //for stack  //O(1)
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){ //O(n)
            //koi bhi Empty Queue ho usii mein add kerdo
            //or dursi non empty queue k sare elements add kerdo fir ussme
          // 5 - 4 - 3 - 2 - 1
         //top             bottom
         //front              rear
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
        }
        public static int pop(){  //O(1)
            if(isEmpty()){
                System.out.println("Already Empty Stack");
                return -1;
            }
            int top = -1;
            // Case 1: Elements are in Queue 1
            if(!q1.isEmpty()){
                top = q1.remove();
            }else{
                // Case 2: Elements are in Queue 2
                top = q2.remove();
            }
            return top;
        }
        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("Already Empty Stack");
                return -1;
            }
            int top = -1;
            //Case 1: Elements are in Queue 1
            if(!q1.isEmpty()){
                top = q1.peek();
            }else{ 
                //Case 2: Elements are in Queue 2
                top = q2.peek();
            }
            return top;
        }

    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        // 3 2 1
    }
}