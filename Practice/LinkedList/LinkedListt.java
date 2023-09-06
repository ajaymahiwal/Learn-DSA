

public class LinkedListt{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        
        LinkedListt ll = new LinkedListt();
        ll.printLL();
        ll.addFirst(10);
        ll.printLL();
        ll.addFirst(50);
        ll.printLL();
        ll.addFirst(20);
        ll.printLL();
        ll.addFirst(100);
        ll.printLL();

        ll.addLast(1000);
        ll.printLL();
        ll.addLast(10000);

        ll.printLL();
    }
}
/**
null
10->null
50->10->null
20->50->10->null
100->20->50->10->null
100->20->50->10->1000->null
100->20->50->10->1000->10000->null
 */