package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given a sorted array arr[] of positive integers, find the smallest positive integer such that it cannot be represented as the sum of elements of any subset of the given array set.

Examples:

Input: arr[] = [1, 2, 3]
Output: 7
Explanation: 7 is the smallest positive number for which no subset is there with sum 7.
Input: arr[] = [3, 6, 9, 10, 20, 28]
Output: 1
Explanation: 1 is the smallest positive number for which no subset is there with sum 1.

 */
public class NotSubsetSum {
    static void main(String[] args) {
        int []arr = {3, 6, 9, 10, 20, 28};
        System.out.println(findSmallest(arr));
    }
    public static long findSmallest(int[] arr) {
        long sum = 1;
        for(int num : arr)
        {
            if(num > sum)
            {
                return sum;
            }
            sum += num;
        }
        return sum;
    }
}
