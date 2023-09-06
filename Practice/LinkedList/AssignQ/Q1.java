

//Date 16-08-23 Leetcode
//Return intersection node if exits , nodes structure vhi rhna chahiye change na ho
public class Q1{
    public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
            val = x;
            next = null;
         }
    }
    public static ListNode headA;
    public static ListNode headB;

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0,sizeB=0;
        ListNode tempA = headA; ListNode tempB = headB;
        while(tempA!=null){
            sizeA++;
            tempA = tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB = tempB.next;
        }
        
        int common = Math.abs(sizeA-sizeB);
        ListNode temp1;
        ListNode temp2;
        if(sizeA>=sizeB){
            temp1 = headA;
            temp2 = headB;
        }else{
            temp1 = headB;
            temp2 = headA;
        }
        
        for(int i=0;i<common;i++){
            temp1=temp1.next;
        }
        
        ListNode intersectionNode=null;
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                intersectionNode = temp1;
                return intersectionNode;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return intersectionNode;
    }

    public static void printLL(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        headA = new ListNode(2);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(7);
        headA.next.next.next = new ListNode(8);
        ListNode intersection = headA.next.next.next;
        headA.next.next.next.next = new ListNode(1);
        headA.next.next.next.next.next = new ListNode(5);

        headB = new ListNode(10);
        headB.next = new ListNode(3);
        headB.next.next = new ListNode(20);
        // headB.next.next = intersection;

        // 2->9->7->8->1->5
        //          ⬆               
        //          |               
        //      10->3


        printLL(headA);
        printLL(headB);
        ListNode result = getIntersectionNode(headA,headB);
        if(result==null){
            System.out.println("No any Intersection Exits");
        }else{
            System.out.println("------Intersection Exits------");
            System.out.println("Intersection Node address:"+result);
            System.out.println("Intersection Node Data:"+result.val);
        }
        
    }
}