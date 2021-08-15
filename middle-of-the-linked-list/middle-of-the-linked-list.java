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
//Tc:0(n)+0(n/2) SC:0(1)
/*class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode temp=new ListNode();
        int size=0;
        temp=head;
        while(temp!=null)
        {
            size=size+1;
            temp=temp.next;
        }
        int n=size/2;
        for(int i=1;i<=n;i++)
        {
            head=head.next;
        }
        return head;
    }
}*/

//TC:0(n/2) AS:0(1)
class Solution
{
    public ListNode middleNode(ListNode head)
    {
       ListNode fast=head;
       ListNode slow=head;
       while(fast!=null && fast.next!=null)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
        return slow;
    }
}

