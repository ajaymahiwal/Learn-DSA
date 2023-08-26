
// https://www.geeksforgeeks.org/introduction-to-circular-queue/

//Date 26-08-23
public class CircularQueue{
    static class Queue{
        static int size;
        static int arr[];
        static int rear;
        static int front;

        public Queue(int n){
            size = n;
            arr = new int[n];
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){ //O(1)
            return front == -1 && rear == -1;
        }
        
        public static boolean isFull(){ //O(1)
            return (rear+1)%size == front;
        }
        public static void add(int data){ //O(1)
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            //When We are Adding 1st Element 
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        
        public static int remove(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is Already Empty.");
                return -1;
            }
            int deleletedData = arr[front];
            //Case for only one element
            if(front == rear){
                front = rear = -1;
                return deleletedData;
            }
            front = (front+1)%size;

            return deleletedData;
        }

        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove()); //10
        q.add(40);
        System.out.println(q.remove()); //20
        q.add(50);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        // 10
        // 20
        // 30 40 50 
    }
}