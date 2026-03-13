package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;

/*
Given a singly linked list containing nodes with English alphabets ('a'-'z'). Rearrange the linked list in such a way that all the vowels come before the consonants while maintaining the order of their arrival.

Examples:

Input: Linked list: a -> b -> c -> d -> e -> f -> g -> h -> i
Output: a -> e -> i -> b -> c -> d -> f -> g -> h

Explanation: After rearranging the input linked list according to the condition the resultant linked list will be as shown in output.
Input: Linked list: a -> b -> a -> b -> d -> e -> e -> d
Output: a -> a -> e -> e -> b -> b -> d -> d

Explanation: After rearranging the input linked list according to the condition the resultant linked list will be as shown in output.
 */
public class ArrangeConsonantsAndVowels {
    char data;
    ArrangeConsonantsAndVowels next;
    public ArrangeConsonantsAndVowels(char ch)
    {
        this.data = ch;
        this.next = null;
    }
    public static void main() {
        ArrangeConsonantsAndVowels head = new ArrangeConsonantsAndVowels('a');
        head.next = new ArrangeConsonantsAndVowels('b');
        head.next.next = new ArrangeConsonantsAndVowels('c');
        head.next.next.next = new ArrangeConsonantsAndVowels('d');
        head.next.next.next.next = new ArrangeConsonantsAndVowels('e');
        head.next.next.next.next.next = new ArrangeConsonantsAndVowels('f');
        head.next.next.next.next.next.next = new ArrangeConsonantsAndVowels('g');
        head.next.next.next.next.next.next.next = new ArrangeConsonantsAndVowels('h');
        head.next.next.next.next.next.next.next.next = new ArrangeConsonantsAndVowels('i');
        System.out.print("Before arrange , LL is :");
        traverse(head);
        System.out.println();
        head = arrangeCV(head);
        System.out.print("After arrange , LL is :");
        traverse(head);
    }
    public static ArrangeConsonantsAndVowels arrangeCV(ArrangeConsonantsAndVowels head) {
        if(head == null || head.next== null)
        {
            return head;
        }
        // write code here and return the head of changed linked list
        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Character> con = new ArrayList<>();
        ArrangeConsonantsAndVowels curr =head;
        while(curr!= null)
        {
            char ch = curr.data;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vow.add(ch);
            }
            else
            {
                con.add(ch);
            }
            curr = curr.next;
        }
        ArrangeConsonantsAndVowels temp = new ArrangeConsonantsAndVowels('a');
        ArrangeConsonantsAndVowels curr1 =temp;
        for(char c : vow)
        {
            ArrangeConsonantsAndVowels newNode = new ArrangeConsonantsAndVowels(c);
            curr1.next = newNode;
            curr1 = curr1.next;
        }
        for(char c : con)
        {
            ArrangeConsonantsAndVowels newNode = new ArrangeConsonantsAndVowels(c);
            curr1.next = newNode;
            curr1 = curr1.next;
        }
        return temp.next;
    }

    public static void traverse(ArrangeConsonantsAndVowels head)
    {
        ArrangeConsonantsAndVowels curr = head;
        while (curr !=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
