package HomePractice.Leetcode.Array.Easy;

import java.util.ArrayList;

/* 1732.
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 1:
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:
Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 */
public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        list.add(max);
        for(int i = 0; i< gain.length; i++)
        {
            max = gain[i] + max;
            list.add(max);
        }
        int maxValue = 0;
        for(int i = 0; i < list.size(); i++)
        {
            maxValue = Math.max(list.get(i),maxValue);
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int []arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
