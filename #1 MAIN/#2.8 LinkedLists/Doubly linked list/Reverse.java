


public class Reverse{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void listReverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

        public static void print(){
        Node temp=head;
        System.out.print(temp.prev+" <-> ");
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println(temp);
    }

    public static void main(String args[]){
        Reverse obj=new Reverse();
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);

        print();

        System.out.println("Doubly LinkedList Reverse :");
        obj.listReverse();
        print();
    }
}