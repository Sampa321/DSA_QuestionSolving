package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a sorted array arr[] (0-index based) of distinct integers and an integer k, find the index of k if it is present in the arr[]. If not, return the index where k should be inserted to maintain the sorted order.

Examples :

Input: arr[] = [1, 3, 5, 6], k = 5
Output: 2
Explanation: Since 5 is found at index 2 as arr[2] = 5, the output is 2.
Input: arr[] = [1, 3, 5, 6], k = 2
Output: 1
Explanation: The element 2 is not present in the array, but inserting it at index 1 will maintain the sorted order.
Input: arr[] = [2, 6, 7, 10, 14], k = 15
Output: 5
Explanation: The element 15 is not present in the array, but inserting it after index 4 will maintain the sorted order.
 */
public class SearchInsertPositionOfKinSortedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS :");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the insert element : ");
        int ele = sc.nextInt();
        System.out.println("array is : "+ Arrays.toString(arr));
        System.out.println("search insert k is : "+searchInsertK(arr,ele));
    }
    public static int searchInsertK(int arr[], int k) {
        // code here
        int i=0;
        for(;i<arr.length;i++)
        {
            if(arr[i]>=k)
            {
                return i;
            }
        }
        return i;
    }
}
