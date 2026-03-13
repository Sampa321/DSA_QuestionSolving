package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
Given a link list, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be the same as that in the original list.

NOTE: Don't create a new linked list, instead rearrange the provided one.

Examples:

Input: Linked list: 17->15->8->9->2->4->6
Output: 8->2->4->6->17->15->9

Explaination: 8,2,4,6 are the even numbers so they appear first and 17,15,9 are odd numbers that appear later.
Input: Linked List: 1 -> 3 -> 5 -> 7
Output: 1->3->5->7

Explaination: There is no even number. So no need for modification.
 */
public class SegregateEvenAndOddNodeInLinkedList {
    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.println("Before divide,Linked list is :");
        Node.traverse(head);
        System.out.println();
        head = divide(head);
        System.out.println("After divide,Linked list is :");
        Node.traverse(head);
    }
   public static Node divide(Node head) {
        // code here
        Node curr=head;
        Node temp=new Node(0);
        Node head1=temp;
        while(curr!=null){
            if(curr.data%2==0){
                head1.next=new Node(curr.data);
                head1=head1.next;
            }
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.data%2!=0)
            {
                head1.next=new Node(curr.data);
                head1=head1.next;
            }
            curr=curr.next;
        }
        return temp.next;
    }
}
