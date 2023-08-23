

//IMPLEMENTATION USING LINKED LIST 
public class Tut02{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack{
        static Node head=null;

        //isempty method
        public static boolean isEmpty(){
            return head==null;
        }
        //push
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1; // stack is empty so return -1
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack obj=new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}