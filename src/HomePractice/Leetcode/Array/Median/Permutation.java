package HomePractice.Leetcode.Array.Median;

import java.util.ArrayList;
import java.util.List;

/*46.
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 */
public class Permutation {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        permutation(nums,0, re);
        return re;
    }
    public static void permutation(int []nums, int index, List<List<Integer>> re)
    {
        if(index == nums.length)
        {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            re.add(permutation);
            return;
        }
        for(int i = index; i < nums.length; i++)
        {
            swap(nums,i,index);
            permutation(nums, index+1, re);
            swap(nums,i,index);
        }
    }
    public static void swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
