

import java.util.*;
public class InBuilt{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(30);
        q.add(10);
        q.add(19);
        q.add(10);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}