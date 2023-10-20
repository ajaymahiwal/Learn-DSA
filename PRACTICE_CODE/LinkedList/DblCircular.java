

public class DblCircular{
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            head.prev = tail;
            tail.next = head;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;

        head.prev = tail;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            head.prev = tail;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        tail.next = head;
    }

    public static void print(){
        Node temp = head;
        System.out.print("Pointing to tail<--");
        while(temp!=tail){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println(temp.data+"-->Pointing to head");
    }
    public static void main(String args[]){
        DblCircular dcll = new DblCircular();
        System.out.println("Doubly Circular Linked List:");
        dcll.addFirst(30);
        dcll.addFirst(3);
        dcll.addFirst(89);
        dcll.addFirst(47);
        dcll.addLast(67); //chienter
        dcll.addLast(77); //satenter

        print();
    }
}