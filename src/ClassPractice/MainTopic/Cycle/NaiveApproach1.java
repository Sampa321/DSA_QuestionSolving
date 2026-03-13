package ClassPractice.MainTopic.Cycle;

public class NaiveApproach1 {

    static void main() {
        Node head = null;
        /*Node head = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(40);
        Node p4 = new Node(50);
        Node p5 = new Node(60);
        Node p6 = new Node(70);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next =p3;*/
        if (detect(head))
        {
            System.out.println("Cycle detect in  linked list");
        }
        else {
            System.out.println("Cycle is not detect in linked list");
        }
    }
    public static boolean detect(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            if(curr.visited)
            {
                return true;
            }
            curr.visited = true;
            curr = curr.next;
        }
        return false;
    }
}
