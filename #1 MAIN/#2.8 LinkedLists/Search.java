public class Search{

    public static Node head;
    public static Node tail;
    public static int size;
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

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
    
    //ITERATIVE APPROACH
    public int searching(int key){ //O(n)
        Node temp=head;
       /* for(int i=0;i<size;i++){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
        }
        return -1; //Not found */
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1; //key not found
    }

    //RECURSIVE APPROACH
    public int helper(Node head,int key){  //O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if( idx== -1 ){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);        
    }
    // helper method bus Node head pass kerne k liye bnaya or sara main kaam usi me ho rha hai

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        Search obj=new Search();
      
        obj.add(0,51);
        obj.add(1,12);
        obj.add(2,31);
        obj.add(3,41);
        obj.add(4,55);
        obj.add(5,43);
        obj.add(6,21);
        obj.add(7,10);

        int key=10;
    //    System.out.println( "Value is on Index: "+obj.searching(key) );
       System.out.println( "Value is on Index: "+obj.recSearch(key) );

      
    }
}
