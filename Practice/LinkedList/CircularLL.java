

public class CircularLL{
     class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
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
            tail.next = head; //this single line will make a circular LL of Simple LL
            return;
        }
        newNode.next = head;
        head = newNode;

        tail.next = head; //this single line will make a circular LL of Simple LL
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head; //this single line will make a circular LL of Simple LL
    }
    public int removeFirst(){
            int val = head.data;
        if(size == 0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            head = tail = null;
            size=0;
            return val;
        }

        head = head.next;
        tail.next = head;
        size--;

        return val;

    }
    
    public int removeLast(){
            int val = tail.data;
        if(size == 0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            head = tail = null;
            size=0;
            return val;
        }

        int i = 1; //position k base per find kerrha hu tail ka prev
        Node temp = head;
        while(i<size-1){
            temp = temp.next;
            i++;
        }
        tail = temp;
        tail.next = head;
        size--;

        return val;

    }
    public void print(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=tail){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->and Pointing back to head");
    }
    public static void main(String args[]){
        CircularLL cll = new CircularLL();
        System.out.println("Circular Linked List:");
        cll.addFirst(63);
        cll.addFirst(44);
        cll.addFirst(77);
        cll.addFirst(21);
        cll.addFirst(98);
        cll.addLast(100);
        cll.addFirst(37);

        cll.print();
        // System.out.println("Tail value:"+tail.data);
        // System.out.println("Tail next value:"+tail.next.data);
        // cll.print();

        cll.removeFirst();
        cll.removeFirst();
        cll.print();
        cll.removeLast();
        cll.removeLast();
        cll.removeLast();
        cll.removeLast();
        cll.print();
        // System.out.println("Tail value:"+tail.data);
        // System.out.println("Tail next value:"+tail.next.data);
    }
}