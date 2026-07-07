package HomePractice.GeeksForGeeks.LinkedList;

public class DLLNode {
    public int data;
    public DLLNode next;
    public DLLNode prev;
    public DLLNode(int data)
    {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
    public static void traverse(DLLNode head)
    {
        DLLNode curr = head;
        while (curr !=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
