package HomePractice.Leetcode.Array.Median;

import java.util.ArrayList;
import java.util.List;

/*78.
given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]]
 */
public class Subset {
   public static void main(String[] args) {
        int []nums = {1,2,3};
       System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        subset(nums, list, 0, result);
        return result;
    }
    public static void subset(int[] nums,ArrayList<Integer> list, int c, List<List<Integer>> result)
    {
        if(c == nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        subset(nums, list, c+1, result);
        list.add(nums[c]);
        subset(nums, list, c+1, result);
        list.removeLast();
    }
}
