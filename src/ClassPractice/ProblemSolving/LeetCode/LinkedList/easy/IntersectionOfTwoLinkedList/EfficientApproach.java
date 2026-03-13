package ClassPractice.ProblemSolving.LeetCode.LinkedList.easy.IntersectionOfTwoLinkedList;

import ClassPractice.ProblemSolving.LeetCode.LinkedList.ListNode;

//160
public class EfficientApproach {
    static void main() {
        ListNode headA = new ListNode(4);
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(8);
        ListNode p3 = new ListNode(4);
        ListNode p4 = new ListNode(5);
        headA.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        ListNode headB = new ListNode(5);
        ListNode Q1 = new ListNode(6);
        ListNode Q2 = new ListNode(1);
        headB.next =Q1;
        Q1.next = Q2;
        Q2.next = p2;

        System.out.println("Node is : "+getIntersectionNode(headA,headB).data);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headA;
        int c1=0;
            while(curr != null)
        {
            c1++;
            curr = curr.next;
        }
        ListNode curr1 = headB;
        int c2=0;
            while(curr1 != null)
        {
            c2++;
            curr1 = curr1.next;
        }
            if(c1>c2)
        {
            int diff = c1-c2;
            curr = headA;
            int c=1;
            while(c<=diff)
            {
                curr = curr.next;
                c++;
            }
            curr1 = headB;
        }
            else
        {
            int diff = c2-c1;
            curr1 = headB;
            int c=1;
            while(c<=diff)
            {
                curr1 = curr1.next;
                c++;
            }
            curr = headA;
        }
            while(curr != curr1)
        {
            curr = curr.next;
            curr1 = curr1.next;
        }
            return curr;
    }
}
