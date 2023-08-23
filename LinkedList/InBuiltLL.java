


//Import First


import java.util.*;
public class InBuiltLL{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        // LinkedList<Integer> number=new LinkedList<>();

        ll.add(10);
        ll.add(30);
        ll.add(20);
        ll.add(100);

        System.out.println(ll);

        ll.removeFirst();

        System.out.println(ll);

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        Iterator<Integer> it =  ll.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}