public class Add{
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
  

    //add continues one after one
    public void add(int idx,int data){
        if(idx==0){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
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

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println(temp);
        // System.out.println("null");
    }

    public static void main(String args[]){

        Add obj=new Add();
         obj.add(0,1);
        obj.add(1,2);
        obj.add(2,3);
        obj.add(3,4);
        obj.add(4,5);
        obj.add(5,6);
        obj.add(6,7);
        obj.add(7,8);

        print();


    }
}