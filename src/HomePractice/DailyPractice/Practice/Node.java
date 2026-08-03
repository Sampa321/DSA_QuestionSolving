package HomePractice.DailyPractice.Practice;

public class Node {
    Node next;
    Node head;
    int data;
    Node(int val)
    {
        this.next = null;
        this.head = null;
        this.data = val;
    }

   public static void traverse(Node head){
        Node curr = head;
        if(curr == null)
        {
            System.out.println("Stack is empty!!");
            return;
        }

        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
