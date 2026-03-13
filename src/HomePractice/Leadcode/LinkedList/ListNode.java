package HomePractice.Leadcode.LinkedList;

public class ListNode {
    public int val;
   public ListNode next;
    public ListNode(int value)
    {
        this.val = value;
        this.next = null;
    }

    public static void traverse(ListNode head)
    {
        while (head!=null)
        {
            System.out.print(head.val+" ");
            head = head.next;
        }

    }
}
