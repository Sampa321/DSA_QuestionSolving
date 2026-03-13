package ClassPractice.MainTopic.LinkedList.Delete;
import ClassPractice.MainTopic.LinkedList.Node;
import java.util.Scanner;

public class DeleteAtPosition {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(40);
        Node p3 = new Node(50);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        System.out.print("Enter position you want to delete element : ");
        int pos = sc.nextInt();
        System.out.println("Before deletion, Linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = DeleteAtPos(pos,head);
        System.out.println("After deletion, Linked list is : ");
        Node.traverse(head);
    }
    public static Node DeleteAtPos(int pos,Node head)
    {
        Node curr = head;
         if(head==null)
         {
             System.out.println("Linked list is empty");
             return head;
         }
         if(head.next == null && pos == 1)
         {
             return null;
         }

         if(pos == 1)
         {
             return head.next;
         }
         for(int i=1;i<pos-1;i++)
         {
             if(curr.next == null)
             {
                 System.out.println("Invalid Position");
                 return head;
             }
             curr = curr.next;
         }
         curr.next = curr.next.next;
         return head;
    }
}
