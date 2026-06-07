package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.HashMap;
/*
Given an array arr[] containing both positive and negative integers, the task is to find the length of the longest subarray with a sum equals to 0.

Note: A subarray is a contiguous part of an array, formed by selecting one or more consecutive elements while maintaining their original order.

Examples:

Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
Output: 5
Explanation: The longest subarray with sum equals to 0 is [-2, 2, -8, 1, 7].
Input: arr[] = [2, 10, 4]
Output: 0
Explanation: There is no subarray with a sum of 0.
Input: arr[] = [1, 0, -4, 3, 1, 0]
Output: 5
Explanation: The longest subarray with sum equals to 0 is [0, -4, 3, 1, 0]
 */
public class LargestSubarrayWithSum0 {
    public static void main(String[] args){
        int []arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLength(arr));
    }
   public static int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxDiff = 0;
        int prevSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            prevSum += arr[i];
            if(prevSum == 0)
            {
                maxDiff = i+1;
            }
            if(map.containsKey(prevSum))
            {
                int prevIndex = map.get(prevSum);
                maxDiff = Math.max(maxDiff, i - prevIndex);
            }
            else
            {
                map.put(prevSum, i);
            }
        }
        return maxDiff;
    }
}
