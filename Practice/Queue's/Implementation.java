

public class Implementation{
    //Using Array
    static class Queue{
        static int size;
        static int arr[];
        static int rear;
        //front = arr[0]
        public Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        //isEmpty
        public static boolean isEmpty(){ //O(1)
            return rear == -1;
        }
        //add
        public static void add(int data){ //O(1)
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        //remove
        public static int remove(){ //O(n)
            if(isEmpty()){
                System.out.println("Already Empty");
                return -1;
            }
            int front = arr[0];
            if(rear == 0){ //Case for only 1 element exist and want to remove.
                rear = -1;
                return front;
            }
            
            for(int i=1;i<=rear;i++){
                arr[i-1] = arr[i];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("Already Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(5);
        q.add(20);
        q.add(7);
        q.add(15);
        q.add(10);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        //5 20 7 15 10 
    }
}