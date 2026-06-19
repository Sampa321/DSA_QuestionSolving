package ClassPractice.MainTopic.Queue;

public class Node {
    int data;
    Node next;
    Node(int value){
        this.next = null;
        this.data = value;
    }
    public static void traverse(Node head){
        if(head == null)
        {
            System.out.println("Queue is empty!!");
        }
        else {
            while (head != null)
            {
                System.out.print(head.data+ " ");
                head = head.next;
            }
        }
    }
}
