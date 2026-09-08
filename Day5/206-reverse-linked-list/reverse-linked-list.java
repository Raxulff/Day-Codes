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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode rh = new ListNode(head.val);
        ListNode trav = head.next;
        while(trav != null){
            ListNode nn = new ListNode(trav.val);
            nn.next = rh;
            rh = nn;
            trav = trav.next;
        }
        return rh;
    }
}