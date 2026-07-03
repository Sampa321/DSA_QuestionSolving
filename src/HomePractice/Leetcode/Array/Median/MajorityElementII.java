package HomePractice.Leetcode.Array.Median;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*229.
Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: [3]
Example 2:
Input: nums = [1]
Output: [1]
Example 3:
Input: nums = [1,2]
Output: [1,2]
 */
public class MajorityElementII {
   public static void main(String[] args) {
        int []arr = {3,2,3};
       System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxValue = nums.length/3;
        for(int  key : map.keySet())
        {
            if(map.get(key) > maxValue)
            {
                list.add(key);
            }
        }
        return list;
    }
}
