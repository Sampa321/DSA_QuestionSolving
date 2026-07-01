package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given an array arr[], find the maximum sum of a non-empty subarray. You are allowed to skip at most one element in the subarray.

Note: After skipping the element, the subarray must still be non-empty.

Examples:

Input: arr[] = [1, 2, 3, -4, 5]
Output: 11
Explanation: We can get maximum sum subarray by skipping -4.
Input: arr[] = [-2, -3, 4, -1, -2, 1, 5, -3]
Output: 9
Explanation: We can get maximum sum subarray by skipping -2 as [4,-1,1,5] sums to 9, which is the maximum achievable sum.
 */
public class MaxSubarraySumByRemovingAtMostOne {
   public static void main(String []args) {
        int []arr = {-2, -3, 4, -1, -2, 1, 5, -3};
       System.out.println(maxSumSubarray(arr));
    }
    public static int maxSumSubarray(int[] arr) {
        // code here
        int res = arr[0];
        int currSum = arr[0];
        int onedelete = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            int curr = arr[i];
            onedelete = Math.max(currSum, onedelete+curr);
            currSum = Math.max(curr, currSum+curr);
            res = Math.max(res, Math.max(currSum,onedelete));
        }
        return res;
    }
}
