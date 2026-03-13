package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Indexes of Subarray Sum
Difficulty: MediumAccuracy: 16.5%Submissions: 1.9MPoints: 4Average Time: 20m
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].

Examples:

Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.
Input: arr[] = [5, 3, 4], target = 2
Output: [-1]
Explanation: There is no subarray with sum 2.
 */
public class IndexesOfSubArraySum {
   public static void main(String[] args) {
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
       System.out.print("Enter the target element : ");
       int target =sc.nextInt();
       System.out.println("Array is : "+ Arrays.toString(arr));
       System.out.println("Result arrayList is : "+subarraySum(arr,target));
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int idx = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];
            while(sum>target && idx<=i)
            {
                sum -= arr[idx];
                idx++;
            }
            if(sum == target)
            {
                list.add(idx+1);
                list.add(i+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
