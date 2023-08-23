
import java.util.*;
public class PushAtBottom{
    public static void pushBottom(int data,Stack<Integer> s){ 
        //TC : O(n) SC: O(n) for stack calls used in memory No any Auxiallry Memory  Used
        if(s.isEmpty()){ //base case
            s.push(data);
            return;
        }
        int value = s.pop(); //kaam
        pushBottom(data,s); // call
        s.push(value);//kaam
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        // System.out.println("Before");
        // Iterator<Integer> it = s.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        pushBottom(10,s);

        // System.out.println("After");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}