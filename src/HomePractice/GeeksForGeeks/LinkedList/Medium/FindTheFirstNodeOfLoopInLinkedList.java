package HomePractice.GeeksForGeeks.LinkedList.Medium;

import ClassPractice.MainTopic.Cycle.Node;

/*
You are given the head of a singly linked list. If a loop is present in the linked list then return the first node of the loop else return -1.

Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null, indicating there is no loop. Note that pos is not passed as a parameter.

Examples:

Input: pos = 2,

Output: 3
Explanation: We can see that there exists a loop in the given linked list and the first node of the loop is 3.
Input: pos = 0,

Output: -1
Explanation: No loop exists in the above linked list. So the output is -1.
 */
public class FindTheFirstNodeOfLoopInLinkedList {
    static void main() {
        Node head = new Node(1);
        Node p1 = new Node(3);
        Node p2 = new Node(2);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p1;
        System.out.println("Cycle start node is : "+cycleStart(head));
    }
    public static int cycleStart(Node head) {
        // code here
        Node temp = new Node(0);
        Node curr = head;
        Node ncurr =null;
        while(curr != null)
        {
            if(curr.next == temp)
            {
                return curr.data;
            }
            ncurr = curr.next;
            curr.next = temp;
            curr = ncurr;

        }
        return -1;
    }
}
