package HomePractice.DailyPractice.Queue;

public class Node {
    int val;
    Node next;
    Node(int data){
        this.val = data;
        this.next = null;
    }


    public static void traverse(Node head)
    {
        if (head == null){
            System.out.println("Queeue is empty!!");
            return;
        }
        while (head != null)
        {
            System.out.println(head.val+" ");
            head = head.next;
        }
    }
}
