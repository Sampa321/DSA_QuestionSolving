package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
Given an array arr[ ] of n positive integers, the task is to find the greatest element on the left of every element in the array which is strictly smaller than itself, if this element does not exist for an index print "-1".

Examples:

Input: n = 5, arr[] = [2, 3, 4, 5, 1]
Output: -1 2 3 4 -1
Explanation:
Greatest element on the left of 3 smaller
than itself is 2, for 4 it is 3 and for 5
it is 1. Since 2 is the first element and
no element on its left is present, so it's
greatest smaller element will be -1 and for
1 no element smaller than itself is present
on its left, so it's greatest smaller element
is -1.
Input: n = 3, arr[] = [1, 2, 3]
Output: -1 1 2
 */
public class SmallestOnLeft {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.println("Smallest on left array is :"+Arrays.toString(Smallestonleft(arr,n)));
    }
    public static int[] Smallestonleft(int arr[], int n) {
        // Complete the function
        TreeSet<Integer> set = new TreeSet<>();
        int []result = new int[n];
        result[0]=-1;
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            Integer smaller = set.lower(arr[i]);
            result[i] = (smaller!=null)?smaller:-1;
            set.add(arr[i]);
        }
        return result;
    }
}
