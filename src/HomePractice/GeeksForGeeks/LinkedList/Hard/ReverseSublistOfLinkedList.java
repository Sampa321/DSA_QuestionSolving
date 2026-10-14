package HomePractice.GeeksForGeeks.LinkedList.Hard;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;

public class ReverseSublistOfLinkedList {
   public static Node reverseBetween(int a, int b, Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        while(curr != null)
        {
            list.add(curr.data);
            curr = curr.next;
        }

        reverse(list, a-1, b-1);


        Node temp = new Node(list.getFirst());
        Node newNode = temp;
        for(int i = 1; i < list.size(); i++)
        {
            newNode.next = new Node(list.get(i));
            newNode  = newNode.next;
        }
        return temp;
    }

   public static void reverse(ArrayList<Integer> list, int start, int end)
    {
        while(start < end)
        {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

   public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(3);
       head.next.next = new Node(5);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(9);
       head.next.next.next.next.next = new Node(8);
       head.next.next.next.next.next.next = new Node(10);
       int a = 2, b = 4;
       head =  reverseBetween(a, b, head);
       Node.traverse(head);
   }
}
