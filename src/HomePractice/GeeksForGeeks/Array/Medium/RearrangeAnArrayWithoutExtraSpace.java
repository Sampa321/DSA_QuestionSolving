package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;

/*
Given an array arr[] of size n where every element is in the range from 0 to n-1. Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].
NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.

Examples:

Input: arr[] = [1,0]
Output: [0, 1]
Explanation: arr[arr[0]] = arr[1] = 0, arr[arr[1]] = arr[0] = 1 So, arrT becomes [0, 1]
Input: arr[] = [4,0,2,1,3]
Output: [3, 4, 2, 0, 1]
Explanation: arr[arr[0]] = arr[4] = 3, arr[arr[1]] = arr[0] = 4, arr[arr[2]] = arr[2] = 2, arr[arr[3]] = arr[1] = 0, arr[arr[4]] = arr[3] = 1 and so on So, arrT becomes [3, 4, 2, 0, 1]
 */
public class RearrangeAnArrayWithoutExtraSpace {
    public static void main(String[] args) {
        long []arr = {4,0,2,1,3};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void arrange(long[] arr) {
        long []re = new long[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            long index = arr[i];

            re[i] = arr[(int)index];
        }
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = re[i];
        }
    }
}
