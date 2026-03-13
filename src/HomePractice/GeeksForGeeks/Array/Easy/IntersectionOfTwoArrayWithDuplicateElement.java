package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both the arrays. The intersection should not have duplicate elements and the result should contain items in any order.

Note: The driver code will sort the resulting array in increasing order before printing.

Examples:

Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
Output: [1, 3]
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.
Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
Output: [1]
Explanation: 1 is the only common element present in both the arrays.
Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
Output: []
Explanation: No common element in both the arrays.
 */
public class IntersectionOfTwoArrayWithDuplicateElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 1st array elements : ");
        int []arr1 = new int[n1];
        for(int i = 0;i<n1;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i]= sc.nextInt();
        }
        System.out.print("Enter the 2nd array size : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the 2nd array elements : ");
        int []arr2 = new int[n2];
        for(int i = 0;i<n2;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i]= sc.nextInt();
        }

        System.out.print("1st array is :");
        for(int i = 0;i<n1;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("2nd array is :");
        for(int i = 0;i<n2;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("Intersection arraylist is :"+intersect(arr1,arr2));
    }
    public static ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:b)
        {
            list.add(ele);
        }
        for(int i=0;i<a.length;i++)
        {
            if(list.indexOf(a[i]) != -1)
            {
                set.add(a[i]);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int ele:set)
        {
            list1.add(ele);
        }
        return list1;
    }
}
