package ClassPractice.ProblemSolving.Geeksforgeeks.LinkedList.Medium.RemoveLoopInLinkedList;

import ClassPractice.MainTopic.LinkedList.Node;

import java.util.HashSet;

public class NaiveApproach {
    static void main() {
        Node head = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next= head;

        System.out.println("After remove loop, linked list is : ");
        removeLoop(head);
        Node.traverse(head);
    }
    public static void removeLoop(Node head) {
        // code here
        Node curr = head;
        HashSet<Node> hs = new HashSet<>();
        while (curr != null) {
            hs.add(curr);
            if (hs.contains(curr.next)) {
                break;
            }
            curr = curr.next;
        }

        if (curr == null) {
            return;
        }
        curr.next = null;
    }
}
