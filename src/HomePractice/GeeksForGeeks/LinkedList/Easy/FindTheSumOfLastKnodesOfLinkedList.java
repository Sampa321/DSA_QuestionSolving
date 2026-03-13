package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given a single linked list, calculate the sum of the last n nodes.

Note: It is guaranteed that n <= number of nodes.

Examples:

Input: Linked List: 5->9->6->3->4->10, n = 3

Output: 17
Explanation: The sum of the last three nodes in the linked list is 3 + 4 + 10 = 17.
Input: Linked List: 1->2, n = 2

Output: 3
Explanation: The sum of the last two nodes in the linked list is 2 + 1 = 3.
 */
public class FindTheSumOfLastKnodesOfLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(5);
        head.next = new Node(9);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(10);
        System.out.print("Enter the number of last node you want to add :");
        int n = sc.nextInt();
        System.out.println("Result is : "+sumOfLastN_Nodes(head,n));
    }
    public static int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.data);
            head = head.next;
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+= list.get(list.size()-i);
        }
        return sum;
    }
}
