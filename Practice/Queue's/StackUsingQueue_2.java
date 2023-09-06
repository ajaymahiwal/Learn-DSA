

// push - O(1)
// pop - O(n)
// peek - O(n)
// isEmpty - O(1)

import java.util.*;
public class StackUsingQueue_2{
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){ //for stack  //O(1)
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){ //O(1)
            //koi bhi NonEmpty Queue ho usii mein add kerdo
            // 1 - 2 - 3 - 4 - 5
         //bottom             top
         //front              rear
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){  //O(n)
            if(isEmpty()){
                System.out.println("Already Empty Stack");
                return -1;
            }
            int top = -1;
            //Case 1 : elements are in q1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                     top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{ //Case 2: elements are in q2
                while(!q2.isEmpty()){
                     top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek(){ //O(n)
            if(isEmpty()){
                System.out.println("Already Empty Stack");
                return -1;
            }
            int top = -1;
            //Case 1 : elements are in q1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                     top = q1.remove();
                    q2.add(top);
                }
            }else{ //Case 2: elements are in q2
                while(!q2.isEmpty()){
                     top = q2.remove();
                    q1.add(top);
                }
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