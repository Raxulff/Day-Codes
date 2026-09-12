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
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        //full reverse
        ListNode currHead = reverse(head);
        ListNode head1 = currHead;
        ListNode trav1 = head1;
        int k1 = 1;
        int n = 0;
        while(currHead != null){
            n++;
            currHead = currHead.next;
        }
        k = k%n;
        while(trav1.next != null && k1 != k){
            System.out.println(trav1.val+" "+n);
            trav1 = trav1.next;
            k1++;
        }
        n = 0;
        ListNode tail1 = trav1;
        ListNode head2 = tail1.next;
        tail1.next = null;
        //reverse(head1);
        
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode tail = head1;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head2;
        return head1;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= null){
            
            ListNode safe = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safe;
        }
        return prev;
    }
}