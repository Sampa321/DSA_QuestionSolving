package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

public class JoinTwoLinkedList {
    static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        Node head2 = new Node(10);
        head2.next = new Node(14);
        head2.next.next = new Node(25);
        head2.next.next.next = new Node(33);
        head2.next.next.next.next = new Node(55);

        Node head = joinTheLists(head1,head2);
        System.out.println("After merge two linked list ,Linked list is : ");
        Node.traverse(head);
    }
    public static Node joinTheLists(Node head1, Node head2) {
        // code here
        Node temp = new Node(0);
        Node curr = temp;
        while(head1 != null)
        {
            curr.next = new Node(head1.data);
            curr = curr.next;
            head1 = head1.next;
        }
        while(head2 != null)
        {
            curr.next = new Node(head2.data);
            curr = curr.next;
            head2 = head2.next;
        }
        return temp.next;
    }
}
