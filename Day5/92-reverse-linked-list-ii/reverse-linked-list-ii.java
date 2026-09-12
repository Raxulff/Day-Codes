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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode dummy = new ListNode(0,head);
        ListNode safe1 = null;
        ListNode safe2 = null;
        ListNode trav1 = head;
        ListNode prev1 = dummy;
        int k1 = 1;
        while(trav1.next != null && k1 != left){
            k1++;
            trav1 = trav1.next;
            prev1 = prev1.next;
        }
        safe1 = trav1;
        prev1.next = null;
        while(trav1.next != null && k1 != right){
            k1++;
            trav1 = trav1.next;
            //prev1 = prev1.next;
        }
        safe2 = trav1.next;
        trav1.next = null;
        ListNode reverseHead = reverse(safe1);
        prev1.next = reverseHead;
        trav1 = dummy;
        while(trav1.next != null ){
        
            trav1 = trav1.next;
        }
        trav1.next = safe2;
        return dummy.next;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode safe = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safe;
        }
        return prev;
    }
}