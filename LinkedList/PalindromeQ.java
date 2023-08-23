


public class PalindromeQ{
    class Node{
        int data;
        // RemoveNthEnd aj; // ye other class ka obj isliye nhi bnate hai kyui ye Node ki properties to access nhi ker payega isliye reference address k liye hum uski class ka obj Node ka bna lete hai

        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void printLL(){
        if(head==null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp =  temp.next;
        }
        System.out.println("null");
    }


    public int removeFirst(){
        if(size==0){
            System.out.println("Already Empty List");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){ //O(n)
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
           prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
     }

    public boolean isPalindrome(){ //O(n^2) MY Approach

        if(size ==0 || size==1){
            return true;
        }
        while(size>1){
            if(head.data!=tail.data){
                return false;
            }
            removeFirst();
            removeLast();
        }
        return true;
    }

    public boolean didiPalindrome(){
        //other coner-case
        //yani Node hi nhi hai YA ak hi node hai to return true kykui palindrome hai vo
        if(head == null || head.next == null){
            return true;
        }

        //(i) find mid using slow fast or myapproach
        Node mid = findMid();  //2nd half ka first Node 

        //(ii) reverse 2nd Half LL 
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //(iii) check both 1st and 2nd Half isEqual or not
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public Node findMid(){
        int half = size/2;
        Node mid = head;
        int i=0;
        while(i<half){
            mid = mid.next;
            i++;
        }
        return mid;
    }
    public static void main(String args[]){
        PalindromeQ ll = new PalindromeQ();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        // ll.addFirst(20);
        // ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();

        // System.out.println("Using Didi Approach:"+ll.didiPalindrome()); //O(n)

        System.out.println("Using MY Approach:"+ll.isPalindrome());      
        //O(n) nhi hai shyad kyuki n/2 element piche se hat rhe hai or n/2 aage or removeLast mein ak Node ko remove kerne mein time lagata hai O(n) or mein n/2 Node ko remove ker rha hu to Time comp. ki baat kre to n/2 ka bna n (constant remove) or fir n Node k liye n time to
        //TOTAL time complexity of MY Approach will be : O(n^2)
        
    }
}