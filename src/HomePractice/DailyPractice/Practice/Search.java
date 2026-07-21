package HomePractice.DailyPractice.Practice;

public class Search {
    public static Node delete(Node head, int pos)
    {
        if (head == null)
        {
            System.out.println("CLL IS empty!!");
            return null;
        }
        if (head.next == null)
        {
            return null;
        }
        Node curr = head;
        int c = 1;
        while (c < pos-1 && curr.next.next != head)
        {
            curr = curr.next;
            c++;
        }
        if(curr.next.next == head)
        {
            System.out.println("Invalid pos");
            return head;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        //Node head = null;
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = head;
        head = delete(head,3);
        Node.traverse(head);
    }

}
