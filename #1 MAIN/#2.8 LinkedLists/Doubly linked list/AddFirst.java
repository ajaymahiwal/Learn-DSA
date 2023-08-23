


public class AddFirst{
    public static class Node{
        int data;
        Node next;
        Node prev;
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

    public void addLast(int data){}  //pending ye bhi kerne hai
    public void removeLast(){}

    public int removeFirst(){
        if(head==null){
            System.out.print("DLL is empty.");
            return -1;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        return val;   //jo Node delete huyii hai uska data
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
        AddFirst obj=new AddFirst();
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);

        print();
        obj.removeFirst();
        print();
        // System.out.println(tail.data);
    }
}