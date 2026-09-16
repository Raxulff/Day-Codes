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
        //ListNode dummy = new ListNode(0,head);
        if(head == null) return head;

        ListNode dum = new ListNode(0,head);
        ListNode prevGrp = dum;
        ListNode curr = head;
        ListNode safe = null;

        while(curr != null){
            int n = 1;
            ListNode trav = curr;

            while(trav != null && trav.next != null && n != k){
                n++;
                trav = trav.next;
            }
            if(n < k){
                prevGrp.next = curr;
                break;
            }
            safe = trav.next;
            trav.next =null;
            
            prevGrp.next = reverse(curr);
            curr.next = safe;
            prevGrp = curr;//trav ->head
            curr = safe;        
        }
        return dum.next;
    }
    public static ListNode reverse(ListNode curr){
        ListNode prev = null;
        while(curr != null){
            ListNode safe = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safe;
        }
        return prev;
    }
}