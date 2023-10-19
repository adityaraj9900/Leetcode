// public void reverse() {    //O(n)
//     	Node prev=null;
//     	Node curr=tail=head;
//     	Node next;
//     	while(curr!=null) {
//     		next=curr.next;
//     		curr.next=prev;
//     		prev=curr;
//     		curr=next;
//     	}
//     	head=prev;
//     }
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head = prev;
        return head;
    }
}