package HomePractice.GeeksForGeeks.LinkedList;

public class Node {
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data = data;
    }
    public static void traverse(Node head)
    {
        Node curr = head;
        while (curr !=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
