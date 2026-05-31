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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode buf = head;
        
        while(buf != null){
            buf = buf.next;
            len++;
        }

        int k = len - ( n - 1 );
        int i = 0;
        ListNode prev = new ListNode(0);
        prev.next = head ;
        ListNode ans = prev;

        while(i < len){
            if(i+1==k){
                prev.next = prev.next.next;
                break;
            }
            i++;
            prev = prev.next;
        }
        if(len ==1){return null;}
        return ans.next;

    }
}
