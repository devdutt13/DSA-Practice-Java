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
       if(head == null || head.next == null){
        return head;
       }
       int len = 0;
       ListNode temp = head;
       while(temp != null){
            temp = temp.next;
            len++;
       }
       if(k > len){
        k = k%len;
       }
        ListNode current = head;
        ListNode prev = null;
       while(k != 0){
        current = head;
        prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        current.next = head;
        head = current;
        prev.next = null;
        k--;
       }
       return head;
    }
}
