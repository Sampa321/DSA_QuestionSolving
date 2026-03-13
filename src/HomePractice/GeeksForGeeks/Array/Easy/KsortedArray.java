package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
Given an array of n distinct elements. Check whether the given array is a k-sorted array or not. A k-sorted array is an array where each element is at most k distance away from its target position in the sorted array.
Return "Yes" if the array is a k-sorted array else return "No".

Examples

Input: n=6, arr[] = {3, 2, 1, 5, 6, 4}, k = 2
Output: Yes
Explanation: Every element is at most 2 distance away from its target position in thesorted array.
Input: n=7, arr[] = {13, 8, 10, 7, 15, 14, 12}, k = 1
Output: No
 */
public class KsortedArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the difference : ");
        int k =sc.nextInt();
        System.out.println("Array is : "+ Arrays.toString(arr));
        if(isKSortedArray(arr,n,k) == "Yes")
        {
            System.out.println("Array is "+k+" sorted");
        }
        else{
            System.out.println("Array is not "+k+" sorted");
        }
    }
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(i-map.get(arr[i]))>k)
            {
                return "No";
            }
        }
        return "Yes";
    }
}
