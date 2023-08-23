
// 1 -> 2 -> 3 -> 4 -> 5 -> null
// ZIG-ZAG FASHION:
// 1 -> 5 -> 2 -> 4 -> 3 -> null

public class Zig_Zag{

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public void add(int idx,int data){
        if(idx==0){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            return;
        }
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=newNode;
    }

    //MID for MergeSort
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next; 
//odd even case m ak hi mid aaye isliye fast asa likha odd case m mid alg aa rha tha
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public void zigZag(){
        //find mid
        Node mid=findMid(head);
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev; //right half head

        Node nextL,nextR;

        //alternate merge - zig-zag merge
        while(left!=null & right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //update left & right
            left=nextL;
            right=nextR;
        }
    }
    
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(temp);
    }
    public static void main(String args[]){
        Zig_Zag obj = new Zig_Zag();
        obj.add(0,1);
        obj.add(1,2);
        obj.add(2,3);
        obj.add(3,4);
        obj.add(4,5);
// 1 -> 2 -> 3 -> 4 -> 5 -> null        

        print();

        System.out.println("ZIG-ZAG FASHION:");        
        obj.zigZag();
        print();
    }
}