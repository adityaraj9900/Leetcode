class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;

        }
        if(sz-n==0){
            return head.next;
        }
        ListNode prev=head;
        int i=1;
        while(i<sz-n){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return head;
        
    }
}
