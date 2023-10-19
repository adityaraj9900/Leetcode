class Solution {
    public ListNode removeNodes(ListNode head) {
      if(head!=null){
          head.next=removeNodes(head.next);
          if(head.next!=null&&head.val<head.next.val){
                 head=head.next;
          }
      }
      return head;
    }
}