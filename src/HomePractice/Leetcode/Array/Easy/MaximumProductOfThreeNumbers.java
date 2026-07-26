package HomePractice.Leetcode.Array.Easy;

import java.util.Arrays;

/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example 1:
Input: nums = [1,2,3]
Output: 6
Example 2:
Input: nums = [1,2,3,4]
Output: 24
Example 3:
Input: nums = [-1,-2,-3]
Output: -6
 */
public class MaximumProductOfThreeNumbers {
   public static void main(String[] args) {
        int []arr = {1,2,3,4};
       System.out.println(maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int first = nums[0]*nums[1]*nums[nums.length-1];
        int last = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(first, last);
    }
}
