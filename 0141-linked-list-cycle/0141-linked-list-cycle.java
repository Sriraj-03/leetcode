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
    public boolean hasCycle(ListNode head) {
        ListNode tor=head;
        ListNode rab=head;
        while(rab!=null && rab.next!=null){
            rab=rab.next.next;
            tor=tor.next;
            if(rab==tor){
                return true;
            }
        }
        return false;
    }
}