/**
:"The idea is to point the current node of the linked list to a node which is created. Whenever a node’s next is pointing to that node it means loop is there. explain me this in easy and simple language
ChatGPT
Absolutely, I'll simplify it further for you:

Imagine you're walking through a long corridor with doors that connect one room to the next. Each room is a "node" in the linked list. There's a rule: you can only move to the next room through the door.

Now, let's say you want to check if this corridor has a loop, meaning you end up back in a room you've already been in.

Here's the trick:

As you walk through the corridor, you carry a special marker, like a unique sticker.
Each time you enter a room (visit a node), you put this sticker on the door (change the "next" pointer) of the room, pointing it to a special room you've created just for this purpose.
Now, if at any point you enter a room and see that its door already has this special sticker (the "next" pointer points to the special room), it means you've walked in a loop. You've gone through the corridor and come back to a room you've been to before.

This sticker trick helps you find out if the corridor has a loop without actually changing anything about the rooms themselves. It's like secretly marking rooms with stickers to figure out if you're going in circles.

So, when they say "point the current node of the linked list to a node which is created," they mean putting a sticker on the door (changing the "next" pointer) of the room (node). If you see a door with this sticker (node's "next" pointing to the created node), you've found a loop!

I hope this visual explanation helps you understand the concept better.
 */

//Date 12-08-23 and 13-08-23
public class DetectCycleInLL{
    public static class Node{
        int data;
        Node next;
        int flag;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.flag = 0;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void printLL(){
        if(head==null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //Cycle - 1
    public static boolean isCycle_1(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //cycle - 2 
    public static boolean isCycle_2(){
        Node sticker = new Node(0);  //Temporary Node Hai
        while(head!=null){
            if(head.next == null){
                return false;
            }
            if(head.next == sticker){
                return true;
            }

            Node next = head.next; //agle node ka Address
            head.next = sticker;  // node ko mark krdiya sticker se
            // System.out.println(sticker);
            // System.out.println(head.next.next);
            head = next; //agle node ko check kerge
        }
        return false;
    }
    //Cycle - 3
    public static boolean isCycle_3(){
        Node temp = head;
        while(temp!=null){
            if(temp.next == null){
                return false;
            }
            if(temp.flag == 1){
                return true;
            }

            temp.flag = 1;
            temp = temp.next;
        }
        return false;
    }
    //Remove Cycle Method - 1
    public static void removeCycle_1(){
        //check cycle exits or not
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                isCycle = true;
                break;
            }
        }
        
        if(isCycle){

            slow = head;
            Node prev = null;
            while(slow!=fast){
                prev = fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next = null;
            System.out.println("Cycle Removed Successfully!");
        }else{
            System.out.println("Cycle Not Exits");
        }
    }
    //Remove Cycle Method - 2
    public static void removeCycle_2(){
        //check cycle exits or not
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.flag == 1){
                isCycle = true;
                break;
            }

            temp.flag = 1;
            prev = temp;
            temp = temp.next;
        }
        
        if(isCycle){
            prev.next = null;
            System.out.println("Cycle Removed Successfully!");
        }else{
            System.out.println("Cycle Not Exits");
        }
    }
    public static void main(String args[]){
        DetectCycleInLL ll = new DetectCycleInLL();
        // 1 -> 2 -> 3 -> 4
        //           |    |
        //           ---- 5
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node temp = head.next.next;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = temp;

        // removeCycle_1();
        // removeCycle_2();
        // printLL();
        System.out.println("Cycle In LL Hai:"+ isCycle_1());
        // System.out.println("Cycle In LL Hai:"+ isCycle_2());
        // System.out.println("Cycle In LL Hai:"+ isCycle_3());
    }
}