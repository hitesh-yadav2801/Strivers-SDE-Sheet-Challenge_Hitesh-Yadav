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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head1 != null || head2 != null || carry != 0){
            int sum = 0;
            if(head1 != null){
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.val;
                head2 = head2.next;
            }
            if(carry != 0){
                sum += carry;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }
}
