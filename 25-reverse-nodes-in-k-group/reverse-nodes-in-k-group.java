/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = null;
        ListNode ptr = head;
        ListNode ktail = null;
        while(ptr!=null){
            int count =0;
            while(count<k && ptr!=null){
                ptr=ptr.next;
                count++;
            }
            if(count==k){
                ListNode revHead = reverse(head,k);
                if(newHead ==null){
                    newHead = revHead;
                }
                if(ktail!=null){
                    ktail.next=revHead;
                }
                ktail=head;
                head =ptr;
            }
        }
        if(ktail!=null){
            ktail.next = head;
        }
        return newHead == null ?head:newHead;
    }
    public ListNode reverse(ListNode head, int k){
        ListNode newHead = null;
        ListNode ptr = head;
        while(k>0){
            ListNode nextNode = ptr.next;
            ptr.next = newHead;
            newHead = ptr;
            ptr = nextNode;
            k--;
        }
        return newHead;
    }
}