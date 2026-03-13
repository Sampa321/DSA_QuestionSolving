package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
You are given a LinkedList ll, you are also given a value k. You need to right-rotate the ll by k.

Example 1:
Input: ll[] = [9, 8, 7, 6, 5, 4, 4], k = 2
Output: 4 4 9 8 7 6 5
Explanation:
First rotation: 4 9 8 7 6 5 4.
Second rotation: 4 4 9 8 7 6 5
Input: ll[] = [99, 6, 33], k = 4
Output: 33 99 6
Explanation:
After rotating it by 4, we get 33 99 6.
 */
public class RotateLinkedListByK {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the linkedList size : ");
        int n = sc.nextInt();
        LinkedList<Integer> li = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Linked list element : ");
            int ele = sc.nextInt();
            li.add(ele);
        }
        System.out.print("How many times you want to rotate:");
        int k = sc.nextInt();
        rotateByK(li,k);
        System.out.print("After rotate linked list,your linked list : ");
        for(int i : li)
        {
            System.out.print(i+" ");
        }
    }
    public static void rotateByK(LinkedList<Integer> ll, int k) {
        // Your code here
        Collections.rotate(ll,k);

        // You don't need to print
    }
}
