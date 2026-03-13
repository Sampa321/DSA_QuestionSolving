package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
Given a linked list, the task is to move all 0s to the front of the linked list. The order of all other elements except 0 should be the same after rearrangement.

Examples:

Input:  0 -> 4 -> 0 -> 5 -> 0
Output: 0 -> 0 -> 0 -> 4 -> 5
Explanation: After moving all 0s of the given list to the front, the list is: 0 -> 0 -> 0 -> 4 -> 5

Input: 0 -> 1 -> 0 -> 1 -> 2
Output: 0 -> 0 -> 1 -> 1 -> 2
Explanation: After moving all 0s of the given list to the front, the list is: 0 -> 0 -> 1 -> 1 -> 2

 */
public class MoveAlltheZeroToTheFrontOfTheLinkedList {
    static void main() {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(3);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next = new Node(9);

        System.out.println("Before move zero, Linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = moveZeroes(head);
        System.out.println("After move zero, Linked list is : ");
        Node.traverse(head);
    }
    public static Node moveZeroes(Node head) {
        // Your Code here.
        Node curr = head;
        int c = 0;
        while(curr != null)
        {
            if(curr.data == 0)
            {
                c++;
            }
            curr = curr.next;
        }
        Node temp = new Node(0);
        Node head1 = temp;
        for(int i=1;i<=c;i++)
        {
            Node newNode = new Node(0);
            head1.next = newNode;
            head1 = head1.next;
        }
        while(head!=null)
        {
            if(head.data!=0)
            {

                head1.next = new Node(head.data);
                head1 = head1.next;
            }
            head = head.next;
        }
        return temp.next;
    }
}
