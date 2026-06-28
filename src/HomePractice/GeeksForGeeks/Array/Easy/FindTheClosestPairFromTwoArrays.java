package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/*
iven two sorted arrays arr1[] and arr2[] of size n and m and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.

Note : In the driver code, the absolute difference between the sum of the closest pair and x is printed.

Examples:

Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 32
Output : [1, 30]
Explanation:The closest pair whose sum is closest to 32 is [1, 30] = 31.
Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 50
Output : [7, 40]
Explanation: The closest pair whose sum is closest to 50 is [7, 40] = 47.
 */
public class FindTheClosestPairFromTwoArrays {
   public static void main(String []args) {
       int []arr1 = {1, 4, 5, 7};
       int []arr2 = {10, 20, 30, 40};
       int x = 32;
       System.out.println(findClosestPair(arr1,arr2,x));
    }
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        ArrayList<Integer> re = new ArrayList<>();
        int i = 0;
        int j = arr2.length-1;
        int minDiff = Integer.MAX_VALUE;
        while( i < arr1.length && j >= 0)
        {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);
            if(diff < minDiff)
            {
                minDiff = diff;
                re = new ArrayList<>(Arrays.asList(arr1[i],arr2[j]));
            }
            if(sum == x) return re;
            else if(sum < x) i++;
            else j--;
        }
        return re;
    }
}
