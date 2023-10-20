
import java.util.*;
public class Implementation{
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    static class Stack{
    /**
    
    static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            return list.remove(list.size()-1);
        }
        public static int peek(){
            return list.get(list.size()-1);
        }

     */

     //Using LinkedList
     static Node head = null;
     public static boolean isEmpty(){
        return head==null;
     }
     public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
     }
     public static int peek(){
        return head.data;
     }

    
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(100);
        s.push(1000);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}