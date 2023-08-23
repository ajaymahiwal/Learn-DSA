public class Tut02_remove{

    
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



    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty.");
            return -1; //any number that shows invaild case means empty
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;  // koi jaruri nhi hai ye line likn
        head=head.next;
        size--;
        return val; //ye vo value hai jo remove ker di gyi hai koi jaruri nhi hai ye line likn
    }


    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty.");
            return -1; //any number that shows invaild case means empty
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        // prev: i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }



    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        Tut02_remove obj=new Tut02_remove();
        // obj.head=new Node(1);
        // Node second=new Node(2);
        // Node third=new Node(3);
        // Node fourth=new Node(4);
        // Node fifth=new Node(5);

        // obj.head.next=second;
        // second.next=third;
        // third.next=fourth;
        // fourth.next=fifth;
        obj.add(0,1);
        obj.add(1,2);
        obj.add(2,3);
        obj.add(3,4);
        obj.add(4,5);
        obj.add(5,6);
        obj.add(6,7);
        obj.add(7,8);

        // print();
        // obj.removeFirst();
        // System.out.println(obj.removeFirst());
        System.out.println(obj.removeLast());
        print();
        System.out.println(tail.data);
    }
}
