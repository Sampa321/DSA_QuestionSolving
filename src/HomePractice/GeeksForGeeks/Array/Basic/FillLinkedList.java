package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.LinkedList;
import java.util.Scanner;

/*
You are given an integer LinkedList ll, you are also given a value k. You need to fill arr with k.

Examples:
Input: ll[] = [1, 2, 3, 4, 5], k = 67
Output: 67 67 67 67 67
Explanation: k is 67, so we fill arr with 67.
Input: ll[] = [7], k = 99
Output: 99
Explanation: k is 99, so we fill arr with 99.
 */
public class FillLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter the linkedList size: ");
        int n  = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            int ele = sc.nextInt();
            list.add(ele);
        }
        System.out.print("Enter the replace value : ");
        int k = sc.nextInt();
        fillLinkedList(list,k);
        for(int ele:list)
        {
            System.out.print(ele+" ");
        }
    }
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {
        // Your code here
        int n = ll.size();
        ll.clear();
        for(int i=0;i<n;i++)
        {
            ll.add(k);
        }
    }
}
