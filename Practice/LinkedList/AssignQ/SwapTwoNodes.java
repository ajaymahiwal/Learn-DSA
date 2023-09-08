    
    // https://leetcode.com/problems/reverse-linked-list-ii/

    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        int i=1;
        ListNode temp1 = head;
        while(i<left-1){
            temp1=temp1.next;
            i++;
        }
        ListNode temp2 = temp1;
        while(i<right-1){
            temp2=temp2.next;
            i++;
        }
        
        ListNode temp1Next2 = temp1.next.next;
        ListNode temp2Next2 = temp2.next.next;
        ListNode temp = temp1.next;
            
        temp1.next = temp2.next;
        temp1.next.next = temp1Next2;
        
        temp2.next = temp;
        temp2.next.next = temp2Next2;
        
        return head;
    }