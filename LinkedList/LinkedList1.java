

 class LinkedList1{
    public static class Node{
        int data;
        Node next;
        public Node(){

        }
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        // LinkedList1 ll = new LinkedList();
        // Node obj = new Node();
        // ll.addFirst(5);
        // ll.addFirst(10);
        // ll.addFirst(15);

        // ll.printLL();

        addFirst(5);
        addFirst(10);
        addFirst(20);

        printLL();
        System.out.println();
        // System.out.println(obj.data);
        System.out.println(head);
        System.out.println(tail);
        // System.out.println(ll.head);
        // System.out.println(ll.tail);
    }
}