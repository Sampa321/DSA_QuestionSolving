package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given an array arr[] of size n containing positive integers, return the maximum length of the bitonic subarray.

A subarray arr[i...j] is considered bitonic if its elements first monotonically increase, and then monotonically decrease. Formally, there exists and index k (where i <= k <= j) such that:

arr[i] <= arr[i+1] <= . . . <= arr[k]
arr[k] >= arr[k+1] >= . . . >= arr[j]
Examples:

Input: arr[] = [12, 4, 78, 90, 45, 23]
Output: 5
Explanation: The longest bitonic subarray is [4, 78, 90, 45, 23], it starts increasing at 4, peaks at 90, and decreases to 23, giving length of 5.
Input: arr[] = [10, 20, 30, 40]
Output: 4
Explanation: The array [10, 20, 30, 40] is striclty increasing with no decreasing part, so longest bitonic subarray is the entire array itself, giving a length of 4.
Input: arr[] = [10, 10, 10, 10]
Output: 4
 */
public class LongestBitonicSubarray {
   public static void main(String[] args) {
        int []arr = {12, 4, 78, 90, 45, 23};
       System.out.println(bitonic(arr));
    }
    public static int bitonic(int[] arr) {
        // code here
        int n = arr.length;
        int []arr1 = new int[n];
        int []arr2 = new int[n];
        arr1[0] = 1;
        arr2[n-1] = 1;
        for(int i = 1; i < n; i++)
        {
            if(arr[i-1] <= arr[i]) arr1[i] = arr1[i-1]+1;
            else arr1[i] = 1;
        }
        for(int i = n-2; i >= 0; i--)
        {
            if(arr[i+1] <= arr[i]) arr2[i] = arr2[i+1]+1;
            else arr2[i] = 1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            ans = Math.max(ans, arr1[i]+arr2[i]-1);
        }
        return ans;
    }
}
