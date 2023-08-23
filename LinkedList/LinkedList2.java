
//add in middle
public class LinkedList2{
    
    static class Node{
        int data;
        Node next;
        // int idx;
        public Node(int data){
            this.data=data;
            this.next=null;
            // this.idx = idx;
        }
    }

    public static Node head;
    public static Node tail;
    // public static int idx;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size+=1;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size+=1;
        //this is for add() so these conditions already written in addFirst() , So no Need to write these llines again because jab idx 0 per add kerna hua to addFirst apne aap dekh lega sab
        // if(head == null){
        //     head=tail=newNode;
        //     return;
        // }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx,int data){
        // idx++;
        if(idx==0){
            addFirst(data);
            return;
        }
        if(idx==size){
            addLast(data);
            return;
        }
    
        Node newNode = new Node(data);
        size+=1;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printLL(){

        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList2 ll = new LinkedList2();

        ll.add(0,10);
        ll.add(1,20);
        ll.add(2,30);
        ll.add(3,40);

        ll.add(0,100);
        ll.add(3,55);
        ll.add(6,1);
        ll.add(7,200);

        ll.printLL();
        System.out.println("HEAD: "+head.data);
        System.out.println("TAIL: "+tail.data);
        System.out.println("SIZE: "+size);
    }
}