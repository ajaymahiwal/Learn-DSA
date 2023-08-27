

import java.util.*;
public class InBuilt{
    public static void main(String args[]){
        q1ueue<Integer> q1 = new LinkedList<>();
        q1ueue<Integer> q2 = new ArrayDeq1ue<>();
        q1.add(10);
        q1.add(30);
        q1.add(10);
        q1.add(19);
        q1.add(10);

        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
    }
}