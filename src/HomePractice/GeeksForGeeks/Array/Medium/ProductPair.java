package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;

/*
Given an integer array arr[] and an integer target, determine whether there exists a pair of elements in the array whose product is equal to target.

Return true if such a pair exists; otherwise, return false.

Examples:

Input: arr[] = [10, 20, 9, 40], target = 400
Output: true
Explanation: As 10 * 40 = 400, the answer is true.
Input: arr[] = [-10, 20, 9, -40], target = 30
Output: false
Explanation: No pair exists with product 30.
Input: arr[] = [-10, 0, 9, -40], target = 0
Output: true
Explanation: As -10 * 0 = 0, the answer is true.
 */
public class ProductPair {
    public static void main(String[] args) {
        int []arr = {-10, 20, 9, -40};
        int target = 30;
        System.out.println(isProduct(arr,target));
    }
    public static boolean isProduct(int[] arr, long target) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j)
        {
            if((long)arr[i]*arr[j] == target)
            {
                return true;
            }
            else if((long)arr[i]*arr[j] < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}
