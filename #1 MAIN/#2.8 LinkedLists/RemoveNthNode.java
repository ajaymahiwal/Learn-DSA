
//find & Remove Nth node from End

public class RemoveNthNode{
    
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
//public static int size;  //we can access anywhere static variable hai isliye or public bhi

    //add continues one after one
    public void add(int idx,int data){
        if(idx==0){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            return;
        }
        //create a node
        Node newNode=new Node(data);
         Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=newNode;
        
    } 

    public void deleteNthNode(int n){ // n is here index
        // calculate size
        int sz=0;   //only accesable in this block
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        // System.out.println(sz);
        if(n==sz){ //RemoveFirst (first from last)
            head=head.next;
        }
        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i < iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
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
        RemoveNthNode obj=new RemoveNthNode();
        obj.add(0,10);
        obj.add(1,20);
        obj.add(2,30);
        obj.add(3,40);
        obj.add(4,50);
        // obj.add(5,60);
        // obj.add(6,70);
        // obj.add(7,80);

        print();
        obj.deleteNthNode(3);
        //after delete a node
        print();

    }
}

