
// In a doubly linked list is a list that has two references, one to the next node, and another to previous node.   ex.      null<- 1 <-> 2 <-> 3 <-> null

public class DoubleLL{
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }        
    }
            public static Node head;
            public static Node tail;

        public static void print(){
            Node temp=head;
            Node start=head.prev;
            System.out.print(start+" <-> ");
            while(start==null && temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.next;
            }
            System.out.print(temp);
        }
    public static void main(String args[]){

        DoubleLL obj=new DoubleLL();
        head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;
        // fourth.next=null;
        
        // head.prev=null; // ye defalut rh jaye ga uper de rkha hai class Node m
        second.prev=head;
        third.prev=second;
        fourth.prev=third;

        print();

        
    }
}