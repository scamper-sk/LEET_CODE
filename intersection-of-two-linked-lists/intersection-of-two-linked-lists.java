/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//brute-force: TC:0(m*n)   AS:0(1)

//better: TC:0(m+n)   AS:0(n)
/*public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        HashSet<ListNode> s=new HashSet<ListNode>();
        while(headA!=null)
        {
            s.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(s.contains(headB))
            {
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}*/

//Best: TC:0(m+n)   AS:0(1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode d1=headA;
        ListNode d2=headB;
        if(headA==null || headB==null) return null;
        while(d1!=d2)
        {
           d1=d1==null?headB:d1.next;
           d2=d2==null?headA:d2.next;
        }
        return d1;
    }
}


