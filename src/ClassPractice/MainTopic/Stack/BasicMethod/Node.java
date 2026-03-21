package ClassPractice.MainTopic.Stack.BasicMethod;

public class Node {
    public int data ;
    public Node next;
    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static void traverse(ClassPractice.MainTopic.Stack.BasicMethod.Node head)
    {
        if(head == null)
        {
            System.out.println("Linked list empty!");
            return;
        }
        ClassPractice.MainTopic.Stack.BasicMethod.Node curr = head;
        while (curr !=  null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
