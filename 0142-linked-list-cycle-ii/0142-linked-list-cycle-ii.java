/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode rab=head;
        ListNode tor=head;
        while(rab!=null && rab.next!=null){
           rab=rab.next.next;
           tor=tor.next;
           if(rab==tor){
           tor=head;
           while(tor!=rab){
            rab=rab.next;
            tor=tor.next;
           }
           return tor;
           }
        }
        return null;
    }
}