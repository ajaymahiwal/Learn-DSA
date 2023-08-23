

public class FindMID{
    public class Node{
        int data;
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
        newNode.next = head;
        head = newNode;
    }
    public void printLL(){
        if(head==null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int findMid(){ // TC O(n)
        //calculate size if not given
        int half = size/2;
        Node mid = head;
        int i=0;
        while(i<half){
            mid=mid.next;
            i++;
        }
        return mid.data;//mid node value
    }

    public int slowFast(){ // TC O(n)
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data; //mid node value
    }
    public static void main(String args[]){
        FindMID ll = new FindMID();

        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(80);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);

        System.out.println("MID using my approach:"+ll.findMid()); //O(n)
        System.out.println("Slow Fast approach:"+ll.slowFast());   //O(n)
        
    }
}