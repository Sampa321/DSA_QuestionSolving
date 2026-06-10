package HomePractice.Leetcode.Array.Easy;

import java.util.ArrayList;
/*   3507.
Given an array nums, you can perform the following operation any number of times:
Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
Replace the pair with their sum.
Return the minimum number of operations needed to make the array non-decreasing.
An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
Example 1:
Input: nums = [5,2,3,1]
Output: 2
Explanation:
The pair (3,1) has the minimum sum of 4. After replacement, nums = [5,2,4].
The pair (2,4) has the minimum sum of 6. After replacement, nums = [5,6].
The array nums became non-decreasing in two operations.
Example 2:
Input: nums = [1,2,2]
Output: 0
Explanation:
The array nums is already sorted.
 */
public class MinimumPairRemovalToSortArray1 {
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        System.out.println(minimumPairRemoval(nums));
    }
    public static int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums)
        {
            list.add(ele);
        }
        int c = 0;
        while(!check(list))
        {
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            // Find adjacent pair with minimum sum
            for (int i = 0; i < list.size() - 1; i++) {

                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge the pair
            list.set(index, minSum);
            list.remove(index + 1);

            c++;
        }
        return c;
    }
    public static boolean check(ArrayList<Integer> list)
    {
        for(int i = 1; i < list.size(); i++)
        {
            if(list.get(i-1) > list.get(i))
            {
                return false;
            }
        }
        return true;
    }
}