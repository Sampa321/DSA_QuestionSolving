package HomePractice.GeeksForGeeks.Array.Basic;


import java.util.Scanner;

/*
You are given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the head of the modified Linked List.

Examples :
Input: x = 6,
Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
Explanation: We can see that 6 is inserted at the end of the linkedlist.
Input: x = 1,
Output: 4 -> 5 -> 1
Explanation: We can see that 1 is inserted at the end of the linked list.
 */
public class LinkedLiskInsertionAtEnd {
    int data;
    LinkedLiskInsertionAtEnd next;
    LinkedLiskInsertionAtEnd(int value)
    {
        this.data = value;
        this.next = null;
    }
    static void main() {
        LinkedLiskInsertionAtEnd head = new LinkedLiskInsertionAtEnd(1);
        LinkedLiskInsertionAtEnd p1 = new LinkedLiskInsertionAtEnd(2);
        LinkedLiskInsertionAtEnd p2 = new LinkedLiskInsertionAtEnd(3);
        LinkedLiskInsertionAtEnd p3 = new LinkedLiskInsertionAtEnd(4);
        LinkedLiskInsertionAtEnd p4 = new LinkedLiskInsertionAtEnd(5);
        LinkedLiskInsertionAtEnd p5 = new LinkedLiskInsertionAtEnd(6);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        insertAtEnd(head,x);
        LinkedLiskInsertionAtEnd current  = head;
        while (current!=null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static LinkedLiskInsertionAtEnd insertAtEnd(LinkedLiskInsertionAtEnd head, int x) {
        // code here
        if(head == null){
            return new LinkedLiskInsertionAtEnd(x);
        }
        LinkedLiskInsertionAtEnd temp = head;
        while(temp.next != null){
            temp =temp.next;
        }
        LinkedLiskInsertionAtEnd n =new LinkedLiskInsertionAtEnd(x);
        temp.next = n;
        return head;
    }
}
