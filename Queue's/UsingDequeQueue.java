
import java.util.Deque;
import java.util.LinkedList;
public class UsingDequeQueue{
    static class Queue{
         //Every Method have Time Complexity O(1)
        Deque< Integer > dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}