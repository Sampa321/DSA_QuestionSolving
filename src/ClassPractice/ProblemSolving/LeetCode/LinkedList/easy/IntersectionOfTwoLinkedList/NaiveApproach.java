package ClassPractice.ProblemSolving.LeetCode.LinkedList.easy.IntersectionOfTwoLinkedList;

import ClassPractice.ProblemSolving.LeetCode.LinkedList.ListNode;

import java.util.HashSet;
//160.
public class NaiveApproach {
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
         HashSet<ListNode> temp = new HashSet<>();
         ListNode curr = headB;
         while (curr != null) {
             temp.add(curr);
             curr = curr.next;
         }
         ListNode curr1 = headA;
         while (curr1 != null) {
             if (temp.contains(curr1)) {
                 return curr1;
             }
             curr1 = curr1.next;
         }
         return null;
     }
}
