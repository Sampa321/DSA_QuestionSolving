package HomePractice.GeeksForGeeks.LinkedList.Medium;


import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null, indicating there is no loop. Note that pos is not passed as a parameter.

Examples:

Input: pos = 2,

Output: 4
Explanation: There exists a loop in the linked list and the length of the loop is 4.
Input: pos = 3,

Output: 3
Explanation: The loop is from 19 to 10. So length of loop is 19 → 33 → 10 = 3.
Input: pos = 0,

Output: 0
Explanation: There is no loop.
 */
public class FindLengthOfLoop {
    public static void main() {
        Node head = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p1;
        System.out.println("Length of loop : "+lengthOfLoop(head));
    }
    public static int lengthOfLoop(Node head) {
        // code here
        if(head == null || head.next== null)
        {
            return 0;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow  == fast)
            {
                break;
            }
        }
        if(slow != fast)
        {
            return 0;
        }

        slow = slow.next;
        int c=1;
        while(slow !=fast)
        {
            c++;
            slow = slow.next;
        }
        return c;
    }
}
