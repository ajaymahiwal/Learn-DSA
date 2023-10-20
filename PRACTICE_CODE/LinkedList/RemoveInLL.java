

public class RemoveInLL{

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
     public static int size;

     public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
     }

     public int removeFirst(){
        if(size==0){
            System.out.println("LL Is Empty");
            return Integer.MIN_VALUE;  //Any Invaild Value
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        int val = head.data;
        head=head.next;
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

        Node prev = head;                         //            ⬇
        //going on node with respect to Index       0 , 1 , 2 , 3 , 4 
        for(int i=0;i<size-2;i++){
           prev = prev.next;
        }                                         //            ⬇
        //going on node with respect to Position    1 , 2 , 3 , 4 , 5
        // for(int i=1;i<size-1;i++){
        //    prev = prev.next;
        // }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
     }
    public static void main(String[] args){
        RemoveInLL ll = new RemoveInLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();
        
        System.out.println("Deleted Value: "+ll.removeFirst());
        ll.printLL();

        System.out.println("Deleted Value: "+ll.removeLast());
        ll.printLL();
    }
}