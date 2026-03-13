package ClassPractice.ProblemSolving.Geeksforgeeks.LinkedList.Medium.RemoveLoopInLinkedList;

import ClassPractice.MainTopic.LinkedList.Node;

public class EfficientApproach {
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
        Node slow = head;
        Node fast = head;
            while(fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }
            if(slow != fast)
        {
            return ;
        }
        slow = head;
            if(fast == head)
        {
            while(fast.next != slow)
            {
                fast = fast.next;
            }
        }
            else
        {
            while(fast.next != slow.next)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }
}
