package HomePractice.GeeksForGeeks.LinkedList.Medium;
import HomePractice.GeeksForGeeks.LinkedList.Node;
import java.util.ArrayList;
import java.util.Collections;

import static HomePractice.GeeksForGeeks.LinkedList.Node.traverse;
/*
You are given the head of a linked list. You have to sort the given linked list using Merge Sort.

Examples:

Input:

Output: 10 -> 20 -> 30 -> 40 -> 50 -> 60
Explanation: After sorting the given linked list, the resultant list will be:

Input:

Output: 2 -> 5 -> 8 -> 9
Explanation: After sorting the given linked list, the resultant list will be:

 */

public class MergeSortForLinkedList {
    static void main(String[] args) {
        Node head = new Node(123);
        Node p1 = new Node(267);
        Node p2 = new Node(33);
        Node p3 = new Node(43);
        Node p4 = new Node(54);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        System.out.print("Before Sorting, LinkedList is : ");
        traverse(head);
        System.out.println();
        System.out.print("After Sorting, LinkedList is : ");
        traverse(mergeSort(head));
    }
    public static Node mergeSort(Node head) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while(temp != null)
        {
            arr.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arr);
        Node newhead = new Node(arr.get(0));
        Node temp1 = newhead;
        for(int i = 1;i<arr.size();i++)
        {
            Node newNode = new Node(arr.get(i));
            temp1.next = newNode;
            temp1 = temp1.next;
        }
        return newhead;
    }
}
