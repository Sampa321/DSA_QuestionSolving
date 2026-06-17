package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.SumOfSubarrayMinimum;
/*
Given an array arr[] of positive integers, find the total sum of the minimum elements of every possible subarrays.

Note: It is guaranteed that the total sum will fit within a 32-bit unsigned integer.

Examples:

Input: arr[] = [10, 20]
Output: 40
Explanation: Subarrays are [10], [20], [10, 20]. Minimums are 10, 20, 10.
Sum of all these is 40.
Input: arr[] = [1, 2, 3, 4]
Output: 20
Explanation: Subarrays are [1], [2], [3], [4], [1, 2], [1, 2, 3], [1, 2, 3, 4], [2, 3], [2, 3, 4], [3, 4]. Minimums are 1, 2, 3, 4, 1, 1, 1, 2, 2, 3.
Sum of all these is 20.
 */
public class NaiveApproach {
    public static void main(String[] args) {
        int []arr = {10, 20};
        System.out.println(sumSubMins(arr));
    }
    public static int sumSubMins(int[] arr) {
        // code here
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                sum += min;
            }
        }
        return sum;
    }
}
