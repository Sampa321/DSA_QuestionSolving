package ClassPractice.MainTopic.LinkedList.Delete;

import ClassPractice.MainTopic.LinkedList.Node;

public class DeleteFirstNode {
    public static void main() {
        //Node head = null;
        Node head = new Node(10);
        /*Node head = new Node(10);
        Node p1= new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(78);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;*/

        if(head == null) {
            System.out.println("list is empty!");
            return;
        }
        System.out.print("Before delete first node :");
        Node.traverse(head);
        head = deleteFirstNode(head);
        System.out.println();
        System.out.print("Current available node : ");
        Node.traverse(head);
    }
    public static  Node deleteFirstNode(Node head)
    {
        if (head == null)
        {
            return head;
        }
        return head.next;
    }
}
