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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        ListNode trav1 = l1;
        ListNode trav2 = l2;
        int carry = 0;
        while(trav1 != null && trav2 != null){
            ListNode temp = new ListNode((trav1.val+trav2.val+carry)%10);
            carry = (trav1.val+trav2.val+carry)/10;
            tail.next = temp;
            tail = temp;
            trav1 = trav1.next;
            trav2 = trav2.next;
        }
        while(trav1 != null){
            ListNode temp = new ListNode((trav1.val+carry)%10);
            carry = (trav1.val+carry)/10;
            tail.next = temp;
            tail = temp;
            trav1 = trav1.next;
            //trav2 = trav2.next;
        }
        while(trav2 != null){
            ListNode temp = new ListNode((trav2.val+carry)%10);
            carry = (trav2.val+carry)/10;
            tail.next = temp;
            tail = temp;
            trav2 = trav2.next;
            //trav2 = trav2.next;
        }
        while(carry != 0){
            ListNode temp = new ListNode((carry)%10);
            carry = (carry)/10;
            tail.next = temp;
            tail = temp;
        }
        return dummy.next;
    }
}