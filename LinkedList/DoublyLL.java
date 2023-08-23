
//Date 14-08-23 (Monday)

public class DoublyLL{
    class Node{
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
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst(){

        int val = head.data;
        if(size == 0){
            System.out.println("null (Empty LL)");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            head = tail = null;
            size=0;
            return val;
        }

        head = head.next;
        head.prev = null;
        size--;

        return val;

    }

    public int removeLast(){
        int val = tail.data;
        if(size==0){
            System.out.println("null (Empty LL)");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            head = tail = null;
            size=0;
            return val;
        }

        tail = tail.prev;
        tail.next = null;
        size--;

        return val;
    }
    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        System.out.print("null<-");
        while(temp.next!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println(temp.data+"->null");
    }

    public void reverse(){
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev ;
    }
    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        System.out.println("Doubly Linked List:");
        dll.addFirst(50);
        dll.addFirst(40);
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);
        // dll.addLast(60);
        // dll.addLast(70);

        dll.print();
        // System.out.println("Node Deleted:"+dll.removeFirst());
        // System.out.println("Node Deleted:"+dll.removeLast());
        // System.out.println("Node Deleted:"+dll.removeLast());

        dll.reverse();
        // System.out.println(tail.data);
        dll.print();
    }
}