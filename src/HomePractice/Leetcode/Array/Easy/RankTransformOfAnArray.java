package HomePractice.Leetcode.Array.Easy;

import java.util.Arrays;
import java.util.HashMap;

/* 1331.
Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.


Example 1:

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
Example 2:

Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.
Example 3:

Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]

 */
public class RankTransformOfAnArray {
   public static void main(String[] args) {
       int []arr = {37,12,28,9,100,56,80,5,12};
       System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int []re = new int[arr.length];
        if(arr.length == 0)
        {
            return re;
        }
        int[] nums = Arrays.copyOf(arr, arr.length);
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 1;
        map.put(nums[0],c++);
        for(int i = 1; i < nums.length;i++)
        {
            if(nums[i-1] == nums[i]) continue;
            map.put(nums[i],c++);
        }
        for(int i = 0; i < arr.length; i++)
        {
            re[i] = map.get(arr[i]);
        }
        return re;
    }
}
