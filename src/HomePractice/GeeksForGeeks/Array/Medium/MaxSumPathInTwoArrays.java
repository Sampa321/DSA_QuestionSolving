package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given two sorted arrays of distinct integers in increasing order a[] and b[], which may have some common elements, find the maximum sum of a path from the beginning of any array to the end of any array. You may switch from one array to the other only at common elements.

Note:  When switching, count the common element only once.

Examples :

Input: a[] = [2, 3, 7, 10, 12], b[] = [1, 5, 7, 8]
Output: 35
Explanation: The path will be (1 + 5 + 7 + 10 + 12) = 35, where 1 and 5 come from arr2 and then 7 is common so we switch to arr1 and add 10 and 12.
Input: a[] = [1, 2, 3], b[] = [3, 4, 5]
Output: 15
Explanation: The path will be (1 + 2 + 3 + 4 + 5) = 15.
 */
public class MaxSumPathInTwoArrays {
   public static void main(String[] args) {
        int []a = {2, 3, 7, 10, 12};
        int []b = {1, 5, 7, 8};
       System.out.println(maxPathSum(a, b));
    }
    public static int maxPathSum(int[] a, int[] b) {
        // code here
        int sm1 = 0, sm2 = 0, i = 0, j = 0,r = 0;
        while(i < a.length && j < b.length)
        {
            if(a[i] < b [j]) sm1 += a[i++];
            else if(a[i] > b[j]) sm2 += b[j++];
            else
            {
                r += Math.max(sm1, sm2)+a[i];
                sm1 = 0;
                sm2 = 0;
                i++;
                j++;
            }
        }
        while(i < a.length) sm1 += a[i++];
        while(j < b.length) sm2 += b[j++];
        return r + Math.max(sm1,sm2);
    }
}
