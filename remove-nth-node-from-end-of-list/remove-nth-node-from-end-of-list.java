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
//This will have time complexity o(2n)
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int count=0;
        int x=c-n+1;
        ListNode temp1=head;
        ListNode prev=null;
        while(temp1!=null)
        {
            count++;
            if(x==1)
            {
                head=head.next;
                temp1.next=null;
            }
            else if(count==x)
            {
                prev.next=temp1.next;
                temp1.next=null;
            }
            prev=temp1;
            temp1=temp1.next;
        }
        return head;
    }
}*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    { 
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        
        for(int i=1;i<=n;i++)
            fast=fast.next;
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        //for edge case, when nth node is the size of the linked list we are not returning            head
        return dummy.next;   
    }
}  