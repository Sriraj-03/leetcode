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
    public boolean isPalindrome(ListNode head) {
       ListNode t1=head;
       ListNode t2=reverse(middle(head));
       while(t1!=null && t2!=null){
        if(t1.val!=t2.val){
            return false;
        }
        t1=t1.next;
        t2=t2.next;
       }
       return true;
        
    }
    public ListNode middle(ListNode head){
         ListNode rab=head;
        ListNode tur=head;

        while(rab!=null&& rab.next!=null){
            rab=rab.next.next;
            tur=tur.next;
        }
        return tur;
    }
    public ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode pre=null;
        ListNode temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head=pre;
        return head;
        
    }
}





// public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         ListNode cur=head;
//         while(cur!=null){
//             arr.add(cur.val);
//             cur=cur.next;}
//         int n=arr.size();
//         for(int i=0;i<n/2;i++){
//             if(arr.get(i)!=arr.get(n-i-1))
//             return false;
//         }
//         return true;
//     }