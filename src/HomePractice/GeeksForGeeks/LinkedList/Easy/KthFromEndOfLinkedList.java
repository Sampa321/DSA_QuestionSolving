package HomePractice.GeeksForGeeks.LinkedList.Easy;
import HomePractice.GeeksForGeeks.LinkedList.Node;
import java.util.Scanner;
/*
You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList. If k is more than the number of nodes, then the return -1.

Examples
Input: LinkedList: 1->2->3->4->5->6->7->8->9, k = 2
Output: 8
Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.

Input: LinkedList: 10->5->100->5, k = 5
Output: -1
Explanation: The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.
 */
public class KthFromEndOfLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        System.out.print("Enter the position from end node :");
        int pos = sc.nextInt();
        System.out.println("This position node is : "+getKthFromLast(head,pos));
    }
    public static int getKthFromLast(Node head, int k) {
        // Your code here
        Node curr = head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr = curr.next;
        }

        if(k>c)
        {
            return -1;
        }
        int pos=c-k;
        curr = head;
        for(int i=1;i<=pos;i++)
        {
            curr=curr.next;
        }
        return curr.data;
    }
}
