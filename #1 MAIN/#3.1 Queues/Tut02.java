
//Queue implementation Array => Circular queue

public class Tut02{
    public static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

         //add  O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }
            // add 1st element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove  O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int result=arr[front];
            //last element delete
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek  O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue.");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(6);
        q.remove();
        q.remove();
        q.remove();

        q.add(6);
        q.add(7);
        q.add(8);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}