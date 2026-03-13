package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;

/*
You are given the head of a singly linked list of positive integers. You have to check if the given linked list is palindrome or not.

Examples:

Input:

Output: true
Explanation: The given linked list is 1 -> 2 -> 1 -> 1 -> 2 -> 1, which is a palindrome.
Input:

Output: false
Explanation: The given linked list is 10 -> 20 -> 30 -> 40 -> 50, which is not a palindrome.
 */
public class PalindromeLinkedList {
    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        System.out.println("Linked list is :");
        Node.traverse(head);
        System.out.println();
        if(isPalindrome(head))
        {
            System.out.println("Linked list is palindrome");
        }
        else {
            System.out.println("Linked list is not palindrome");
        }
    }
    public static boolean isPalindrome(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null)
        {
            list.add(head.data);
            head = head.next;
        }
        int i=0,j=list.size()-1;
        while(i<=j)
        {
            if(!list.get(i).equals(list.get(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
