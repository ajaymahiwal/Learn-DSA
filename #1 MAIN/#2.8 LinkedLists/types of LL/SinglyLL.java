
// a singly linked list, as each node only keeps a reference to its successor node.
// 1 -> 2 -> 3 -> null

public class SinglyLL{
    public static class Node{
        int data;
        Node  next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
   
    public static void main(String args[]){

        Singly obj=new Singly();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        
        // 1 -> 2 -> 3 ->null
    }
}
