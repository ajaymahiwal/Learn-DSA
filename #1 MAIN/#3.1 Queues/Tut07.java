
//Deque => Double Ended Queue
import java.util.*;
public class Tut07{
    public static void main(String args[]){
        Deque<Integer> d=new LinkedList<>();
        //Deque m dono sides aage ya piche se remove,add etc. sab kuch ker skte hai
//add()
//addFirst()
//addLast()
//remove()
//removeFirst()
//removeLast()
//peek()
//getFirst()
//getLast()


        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);

        

        d.addLast(5);
        d.addLast(6);
        d.addLast(7);

        System.out.println("remove element is: "+ d.removeFirst());
        while(!d.isEmpty()){
            System.out.println(d.getLast());
            // System.out.println(d.getFirst());
            System.out.println(d.remove());
        }
    }
}