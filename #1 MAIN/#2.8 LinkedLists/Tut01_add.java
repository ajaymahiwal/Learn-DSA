//http://mathcenter.oxford.emory.edu/site/cs171/linkedLists/#:~:text=A%20linked%20list%20is%20a,reference%20to%20the%20next%20node.
public class Tut01_add{
    public static class Node{  //nodes contain two type of info data and reference
        int data;
        Node next; //REFERENCE VARIABLE jisaka type Node hai (yani class name)

        public Node(int data){
            this.data=data;
            this.next=null; //we assume here node is single & this is not connected with anynode.
        }
    }
    /*link list m ak hi head hota hai or ak hi tail to une main class k ander hi as a property define ker skte hai */
    public static Node head; //ye bhi ak refernece variable hai isliye iska type bhi Node(class)
    public static Node tail;
    public static int size; //for linklist size(java automatic initilize with 0 so here size is 0)

    public void addFirst(int data){
        //step 1: create new node
        Node newNode=new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        //step 2: newNode next =head
        newNode.next=head;
        //step 3: head=newNode
        head=newNode;
    }


    public void addLast(int data){
        //step 1: create new node
        Node newNode=new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        //step 2: tail next =new node
        tail.next=newNode;
        //step 3: tail=newNode
        tail=newNode;
    }


    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
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
        //i=idx-1    temp->pre
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public void print(){  //Time Complexity Of This print() Method -> O(n)
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){

        Tut01_add ll=new Tut01_add();
        // ll.head=new Node(1);
        ll.print();
        // ll.addFirst(1);
        // ll.addFirst(2);
        ll.addFirst(1);
        
        ll.print();
        ll.add(1,10);

        // ll.addLast(5);
        ll.print();

        System.out.println("size of linked list is: "+size);  
//static variable hai is liye bina object k access ker liya nhi to likhna pdta--> objname.size
    }
}