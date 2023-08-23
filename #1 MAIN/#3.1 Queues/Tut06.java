

//Queue using two stacks 
//method 1   push() => O(n)  and pop() => O(1) ✅
//method 2   push() => O(1)  and pop() => O(n) ❌

import java.util.*;
public class Tut06{
    public static class Queue{
        static Stack<Integer> s1 =new Stack<>();
        static Stack<Integer> s2 =new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();// && s2.isEmpty();
        }
        //add or push
        public static void add(int data){
            // if(!s1.isEmpty()){
            s1.push(data);
        // } else{
        //     s2.push(data);
        // }
        }
        //remove or pop
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty.");
                return -1;
            }
            int last=-1;

            //case 1
            // if(!s1.isEmpty()){
                // while(!s1.isEmpty()){
                //     last=s1.pop();
                //     // remove();
                //     s2.push(last);
                // }
            while(!s1.isEmpty()){
                 last=s1.pop();
                s2.push(last);
            }

            int top=s2.pop();
            bottompush(s1,top);
            return s2.pop();
        }
        public static void bottompush(Stack<Integer> s1,int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }
            bottompush(s1,data);
            s1.push(data);
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty.");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();  //Queue here is a nested class

        q.add(1);
        q.add(2);
        q.add(3);
      
      while(!q.isEmpty()){
        System.out.println(q.remove());
      }
        
    }
}


////method 1   push() => O(n)  and pop() => O(1)
/*
import java.util.*;
public class Tut06{
    public static class Queue{
        static Stack<Integer> s1 =new Stack<>();
        static Stack<Integer> s2 =new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add or push
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove or pop
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty.");
                return -1;
            }
            return s1.pop();
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty.");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();  //Queue here is a nested class

        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        
    }
}
*/
 