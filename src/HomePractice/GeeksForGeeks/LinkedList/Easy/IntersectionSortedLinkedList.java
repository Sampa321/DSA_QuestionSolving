package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
Given that two linked lists are sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

Examples:
Input: LinkedList1 = 1->2->3->4->6, LinkedList2 = 2->4->6->8
Output: 2->4->6
Explanation: For the given two linked list, 2, 4 and 6 are the elements in the intersection.

Input: LinkedList1 = 10->20->40->50, LinkedList2 = 15->40
Output: 40
Explaination:
 */
public class IntersectionSortedLinkedList{
    static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(10);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        Node head2 = new Node(10);
        head2.next = new Node(14);
        head2.next.next = new Node(25);
        head2.next.next.next = new Node(30);
        head2.next.next.next.next = new Node(55);
        Node head = findIntersection(head1,head2);
        System.out.print("Intersection linked list is : ");
        Node.traverse(head);
    }
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node head = new Node(0);
        Node curr=head;
        while(head1!=null && head2!=null)
        {
            if(head1.data == head2.data)
            {
                curr.next=new Node(head1.data);
                head1 = head1.next ;
                head2 = head2.next ;
                curr = curr.next;
            }
            else if(head1.data<head2.data)
            {
                head1 = head1.next;
            }
            else
            {
                head2= head2.next;
            }
        }
        return head.next;
    }
}
