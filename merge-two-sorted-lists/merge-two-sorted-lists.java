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

//TC: 0(n1+n2)    SC: 0(n1+n2)
/*class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode d=new ListNode();
        ListNode dd=d;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
            dd.next=new ListNode(l1.val);
            dd=dd.next;
            l1=l1.next;
            }
            else if(l2.val<l1.val)
            {
                dd.next=new ListNode(l2.val);
                dd=dd.next;
                l2=l2.next;
            }
            else if(l1.val==l2.val)
            {
                dd.next=new ListNode(l1.val);
                dd=dd.next;
                l1=l1.next;
                dd.next=new ListNode(l2.val);
                dd=dd.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            dd.next=new ListNode(l1.val);
            dd=dd.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            dd.next=new ListNode(l2.val);
            dd=dd.next;
            l2=l2.next;
        }
        return d.next;
    }
}*/


//TC: 0(n1+n2)     SC:0(1)
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        if(l1.val>l2.val)
        {
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode res=l1;
        while(l1!=null && l2!=null)
        {
            ListNode temp=null;
            while(l1!=null && l1.val<=l2.val)
            {
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;
            //swap
            temp=l1;
            l1=l2;
            l2=temp;
        }
       return res; 
    }
}

