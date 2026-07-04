package HomePractice.Leetcode.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array arr containing non-negative integers. Count and return an array res where res[i] denotes the number of smaller elements on right side of arr[i].

Examples:

Input: arr[] = [12, 1, 2, 3, 0, 11, 4]
Output: [6, 1, 1, 1, 0, 1, 0]
Explanation: There are 6 smaller elements right after 12. There is 1 smaller element right after 1. And so on.
Input: arr[] = [1, 2, 3, 4, 5]
Output: [0, 0, 0, 0, 0]
Explanation: There are 0 smaller elements right after 1. There are 0 smaller elements right after 2. And so on.
 */
public class CountSmallerOnRight {
   public static void main(String[] ARGS) {
        int []arr = {12, 1, 2, 3, 0, 11, 4};
       System.out.println(Arrays.toString(lowerArray(arr)));
    }

    public static int[] lowerArray(int[] arr) {
        int n = arr.length;
        int[]res = new int[n];
        ArrayList<Integer> ele = new ArrayList<>();
        ele.add(arr[n-1]);
        res[n-1] = 0;
        for(int i = n-2; i >= 0; i--){

            int left = 0, right = ele.size()-1;
            while(left <= right){
                int mid = (left+right)/2;
                int element = ele.get(mid);
                if(arr[i]>element){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            ele.add(left, arr[i]);
            res[i] = left;
        }
        return res;
    }
}
