// 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> null
// 80 -> 70 -> 60 -> 50 -> 40 -> 30 -> 20 -> 10 -> null

public class Reverse{
    public static class Node{
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
    
    //add continues one after one
    public void add(int idx,int data){
        if(idx==0){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            return;
        }
        //create a node
        Node newNode=new Node(data);
        size++;
         Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=newNode;
        
    }


    //reverse a linklist -> Iterative approach
    public void reverseList(){  //O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Reverse obj=new Reverse();
        obj.add(0,10);
        obj.add(1,20);
        obj.add(2,30);
        obj.add(3,40);
        obj.add(4,50);
        obj.add(5,60);
        obj.add(6,70);
        obj.add(7,80);

        print();

        obj.reverseList();

        print();
    }
}