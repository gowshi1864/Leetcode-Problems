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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode tptr=head;
        while(tptr!=null)
        {
            tptr=tptr.next;
            count++;
        }
        int pos=count/2;
        for(int i=0;head!=null && i<pos;i++)
        {
            head=head.next;
        }
        return head;
    }
}