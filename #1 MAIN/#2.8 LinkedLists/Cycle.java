

//detecting Cycle in LL(Linked List)
//cycle k ander kabhi null nhi aata 
public class Cycle{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    
                

    //floyd's Cycle ( Slow Fast approach or two pointer approach )
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){ //ye condition hai noraml LL ki bina Cycle vali
 //kukii cycle m null nhi aata or ye condition chalti rhe gi cycle hua to true nhi to false
            slow=slow.next; //+1 (ak jump)
            fast=fast.next.next; //+2(doo jump) 
            if(slow==fast){
                return true; //Cycle exists.
            }
        }
        return false; //Cycle Doesn't exist.
    }



    //detect and remove cycle if exists
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){ 
            slow=slow.next; 
            fast=fast.next.next; 
            if(slow==fast){
                cycle=true; //cycle exists.
                break;
            }
        }
        if(cycle==false){
            return;  //cycle doesn't exist so return from method removeCycle
        }

        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle last.next = null
        prev.next=null;

    }

  
    public static void main(String args[]){
        Cycle obj=new Cycle();

        //making a random LL 
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;
        //1 -> 2 -> -> 3 -> 4 -> 2  Cycle exists.
        System.out.println(obj.isCycle());  
        removeCycle();
        System.out.println(obj.isCycle()); //phle cycle exists kerta tha likin ab nhi removed

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        //1 -> 2 -> -> 3 -> 4   Cycle doesn't exist. 
        // System.out.println(obj.isCycle());



      

    }
}