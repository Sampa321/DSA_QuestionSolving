package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.HashMap;

import static HomePractice.GeeksForGeeks.LinkedList.Node.traverse;

/*
Given a sorted linked list, delete all nodes that have duplicate numbers (all occurrences), leaving only numbers that appear once in the original list, and return the head of the modified linked list.
Examples:
Input: Linked List = 23->28->28->35->49->49->53->53
Output: 23 35
Explanation:
The duplicate numbers are 28, 49 and 53 which are removed from the list.
Input: Linked List = 11->11->11->11->75->75
Output: Empty list
Explanation:
All the nodes in the linked list have duplicates. Hence the resultant list would be empty.
 */
public class RemoveAllOccurencesDuplicateInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(28);
        head.next.next = new Node(28);
        head.next.next.next = new Node(35);
        head.next.next.next.next = new Node(49);
        head.next.next.next.next.next = new Node(49);
        head.next.next.next.next.next.next = new Node(53);
        head.next.next.next.next.next.next.next = new Node(53);
        head = removeAllDuplicates(head);
        traverse(head);
    }
    public static Node removeAllDuplicates(Node head) {
        // code here
        if(head== null || head.next== null)
        {
            return head;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null)
        {
            int ele = temp.data;
            map.put(ele,map.getOrDefault(ele, 0)+1);
            temp = temp.next;
        }
        Node dummy = new Node(0);
        Node curr = dummy;
        temp = head;
        while(temp != null)
        {
            if(map.get(temp.data) == 1)
            {
                curr.next = new Node(temp.data);
                curr = curr.next;
            }
            temp = temp.next;
        }

        return dummy.next;

    }
}
