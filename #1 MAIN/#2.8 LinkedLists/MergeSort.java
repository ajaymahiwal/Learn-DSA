


public class MergeSort{

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


/* iska return type Node isliye likha hai,kukui ye baad me ak sorted linklist return kerga */
    public Node mergeSort(Node head){  
        if(head==null || head.next==null){
            return head;
        }

        //find mid
        Node mid=findMid(head);
        //left and right Merge sort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1); //temp node or linklist
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergeLL.next;  //taki vo temp node -1 remove ho jaye
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
        MergeSort  obj = new MergeSort();
        obj.add(0,21);
        obj.add(1,15);
        obj.add(2,10);
        obj.add(3,25);
        obj.add(4,54);
        obj.add(5,34);
        //21 -> 15 -> 10 -> 25 -> 54 -> 34 -> null
        // System.out.println(head.data);

        print();

        System.out.println("Linked List is Sorted Now....");
        head=obj.mergeSort(head);
        print();
    }
}