package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import static HomePractice.GeeksForGeeks.LinkedList.Node.traverse;

/*
Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even position nodes are together. (Considering 1-based indexing.)

Note: You should place all odd-positioned nodes first and then the even-positioned ones. Also, the relative order of odd-positioned nodes and even-positioned nodes should be maintained.

Examples:

Input: LinkedList: 1->2->3->4
Output: 1->3->2->4
Explanation: Odd elements are 1, 3 and even elements are 2, 4. Hence, resultant linked list is 1->3->2->4

Input: LinkedList: 1->2->3->4->5
Output: 1->3->5->2->4
Explanation: Odd elements are 1, 3, 5 and even elements are 2, 4. Hence, resultant linked list is 1->3->5->2->4.

 */
public class RearrangeLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        rearrangeEvenOdd(head);
        traverse(head);
    }
    public static void rearrangeEvenOdd(Node head) {
        //  The task is to complete this method
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
    }
}
