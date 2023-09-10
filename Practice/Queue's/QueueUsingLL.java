
//LL Using Queue = removeFirst()  +  addLast()
public class QueueUsingLL{
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){ //O(1)
            return head ==null && tail==null;
        }
        public static void add(int data){ //O(1)
            Node newNode = new Node(data);
            if(head == null){
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){ //O(1)
            int front = head.data;
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            //for single element
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }

            return front;
        }
        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(50);
        q.add(20);
        q.add(70);
        q.add(15);
        q.add(10);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}