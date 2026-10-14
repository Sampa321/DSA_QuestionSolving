package HomePractice.DailyPractice.LinkedList;

public class Traverse {

    public static int search(Node head, int key){
        if (head == null)
        {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        int pos = 1;
        while(head != null)
        {
            if (head.data == key)
            {
               return pos;
            }
            head = head.next;
            pos++;
        }
        return -1;
    }
   public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(23);
        head.next.next = new Node(67);
        head.next.next.next = new Node(90);
        head.next.next.next.next = new Node(97);
       System.out.println(search(head, 87));
    }
}
