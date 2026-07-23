package ClassPractice.MainTopic.LinkedList.DoublyLinkedList.Deletion;
import ClassPractice.MainTopic.LinkedList.DoublyLinkedList.Node;

public class DeleteAtPos {
    public static Node deletePos(Node head, int pos){
        if (head == null)
        {
            return null;
        }

        if (pos == 1 && head.next == null) return null;
        if(pos == 1)
        {
            head.next.prev = null;
            return head.next;
        }
        Node curr = head;
        for(int i = 1; i < pos-1 && curr != null; i++)
        {
            curr = curr.next;
        }
        if (curr == null || curr.next == null) {
            System.out.println("Invalid pos");
            return head;
        }


        curr.next = curr.next.next;
        if(curr.next != null)
        {
            curr.next.prev = curr;
        }
        return head;
    }
    public static void main(String[] args) {
        //Node head1 = null;
        //Node head1 = new Node(10);
        Node head1 = new Node(10);
        Node head2 = new Node(20);
        Node head3 = new Node(30);
        Node head4 = new Node(40);
        Node head5 = new Node(50);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = null;
        head1.prev = null;
        head2.prev = head1;
        head3.prev = head2;
        head4.prev = head3;
        head5.prev = head4;

        head1 = deletePos(head1,4);
        Node.traverse(head1);
    }
}
