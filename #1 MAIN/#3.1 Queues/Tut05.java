
//Queue implementation using Java Collection Framework(JCF)  
//JCF m yha sab ki time complexity =>O(n)
import java.util.*;
public class Tut05{
    public static void main(String args[]){
        // Queue<Integer> q =new LinkedList<>();
        Queue<Integer> q =new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}