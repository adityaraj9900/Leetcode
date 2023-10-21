public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode kutti=new ListNode(0);
        kutti.next=head;
        ListNode curr=kutti;
        while (curr.next!=null){
            ListNode nextNode=curr.next;
        while(nextNode.next!=null&&nextNode.next.val==curr.next.val){
                nextNode=nextNode.next;
            }
            if(curr.next!=nextNode){
                curr.next=nextNode.next;
            }else{
                curr=curr.next;
            }
        }
        return kutti.next;
    }
}
