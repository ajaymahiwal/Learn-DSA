


public class Palindrome{
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



    //SLOW-FAST APPROACH USED HERE FOR FINDMID
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1 (ak jump)
            fast = fast.next.next; //+2(doo jump)
        }
        return slow; //slow is the mid
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){  //yani ak single node hai ya hai nhi nhi us case me TRUE hi hoga
            return true;
        }
        //find mid
        Node mid=findmid(head);
        //reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev; //right half head

        //check lefthalf and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }
    public static void main(String args[]){
        Palindrome obj=new Palindrome();
        obj.add(0,5);
        obj.add(1,5);
        obj.add(2,5);
        obj.add(3,6);

        if(obj.checkPalindrome()){
            System.out.println("LL is Palindrome.");
        }else{
            System.out.println("LL is not Palindrome.");
        }
      
    }
}