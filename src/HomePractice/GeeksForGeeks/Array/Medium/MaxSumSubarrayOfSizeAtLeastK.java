package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given an array arr[] and an integer k, find the maximum sum among all contiguous subarrays having a length greater than or equal to k.

Examples:

Input: arr[] = [1, -2, 2, -3], k = 3
Output: 1
Explanation: The sub-array of length at least 3 that produces greatest sum is [1, -2, 2]
Input: arr[] = [1, 1, 1, 1, 1, 1], k = 2
Output: 6
Explanation: The sub-array of length at least 2 that produces greatest sum is [1, 1, 1, 1, 1, 1]
Input: arr[] = [-4, -2, 1, -3], k = 2
Output: -1
Explanation: The sub-array of length at least 2 that produces greatest sum is [-2, 1]
 */
public class MaxSumSubarrayOfSizeAtLeastK {
    public static int maxSumWithK(int[] arr, int k) {
        // code here
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
        }
        int maxSum = sum;
        int p = maxSum;
        for(int i = k;i < n; i++)
        {
            sum = sum + arr[i] - arr[i-k];
            p = Math.max(p + arr[i], sum);
            maxSum = Math.max(maxSum, p);
        }
        return maxSum;
    }

   public static void main(String[] args) {
       int []arr = {1, -2, 2, -3};
       int k = 3;
       System.out.println(maxSumWithK(arr, k));
    }
}
