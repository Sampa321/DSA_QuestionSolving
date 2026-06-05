package HomePractice.Leadcode.Array.Hard;

import java.util.Arrays;

/* 4.
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
       int []nums1 = {1,2};
       int []nums2 = {3,4};
        System.out.printf("%.5f", findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []newArr = new int[nums1.length+nums2.length];
        int idx = 0;
        for(int i = 0; i < nums1.length;i++)
        {
            newArr[idx++] = nums1[i];
        }
        for(int i = 0; i < nums2.length;i++)
        {
            newArr[idx++] = nums2[i];
        }
        Arrays.sort(newArr);
        if(newArr.length % 2 != 0)
        {
            return (double)newArr[newArr.length/2];
        }
        double re = newArr[(newArr.length/2)-1]+newArr[(newArr.length/2)];
        return re/2;
    }
}
