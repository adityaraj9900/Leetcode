class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode kutti=head;
        int count=0;
        while(kutti!=null&&count<k){
            kutti=kutti.next;
            count++;
        }
        if(count==k){
            kutti=reverseKGroup(kutti,k);
            while(count>0){
                ListNode nextNode=head.next;
                head.next=kutti;
                kutti=head;
                head=nextNode;
                count--;
            }
            head=kutti;
        }
        return head;
    }
}