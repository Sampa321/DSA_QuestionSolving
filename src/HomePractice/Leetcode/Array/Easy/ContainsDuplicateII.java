package HomePractice.Leetcode.Array.Easy;

import java.util.HashMap;

/* 219.
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class ContainsDuplicateII {
    public static void main(String []args) {
        int []nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(set.containsKey(nums[i]))
            {
                if((i - set.get(nums[i])) <= k) return true;
            }
            set.put(nums[i], i);
        }
        return false;
    }
}
