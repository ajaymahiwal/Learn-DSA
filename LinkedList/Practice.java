

public class Practice{
    class Node{
        int data;
        // Practice aj; // ye other class ka obj isliye nhi bnate hai kyui ye Node ki properties to access nhi ker payega isliye reference address k liye hum uski class ka obj Node ka bna lete hai

        Node next;
        public Node(int data){
            this.data=data;
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
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }else if(idx==size){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }
    public void printLL(){
        if(head==null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp =  temp.next;
        }
        System.out.println("null");
    }


    public int removeFirst(){
        if(size==0){
            System.out.println("Already Empty List");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
           prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
     }
    public int removeNthFromEnd(int idx){
        if(size==0){
            System.out.println("Already Empty List");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        if(idx == size){
            return removeFirst();
        }
        if(idx == 0){
            return removeLast();
        }
        Node temp = head;
        int sz=0;
        while(temp!=null){
            sz++;
            temp = temp.next;
        }
        int stToIdx= sz - idx;
        Node prev = head;
        int i=1;
        while(i<stToIdx){
            prev = prev.next;
            i++;
        }
        int val = prev.data;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    public static void main(String args[]){
        Practice ll = new Practice();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.printLL();
        ll.addLast(5);
        ll.printLL();
        ll.add(100,0);
        ll.add(1000,0);
        ll.add(1000,6);
        ll.printLL();
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);
        ll.removeNthFromEnd(3);
        ll.printLL();
        ll.removeNthFromEnd(6);
        ll.printLL();
        ll.removeNthFromEnd(0);
        ll.printLL();
    }
}