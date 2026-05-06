package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given an integer array arr[] of size n, compute the sum of the bitwise XOR for all distinct pairs of elements. That is, consider every pair of indices (i, j) such that 0 ≤ i < j < n, and calculate the total sum of (arr[i] XOR arr[j]) over all such pairs.

Examples :

Input : arr[] = [7, 3, 5]
Output : 12
Explanation:
All pairs (i, j) such that i < j and their XOR values are:
7 ^ 3 = 4
7 ^ 5 = 2
3 ^ 5 = 6
Sum of all XOR values = 4 + 2 + 6 = 12.
Input : arr[] = [5, 9, 7, 6]
Output : 47
Explanation:
All pairs (i, j) such that i < j and their XOR values are:
5 ^ 9 = 12
5 ^ 7 = 2
5 ^ 6 = 3
9 ^ 7 = 14
9 ^ 6 = 15
7 ^ 6 = 1
Sum of all XOR values = 12 + 2 + 3 + 14 + 15 + 1 = 47.
Input : arr[] = [10]
Output : 0
Explanation: Since there are no pairs, sum is 0.
 */
public class SumOfXorOfAllPairs {
    public static void main(String[] args) {
        int []arr = {7,3,5};
        System.out.println(sumXORValue(arr));
    }
    public static long sumXORValue(int[] arr) {
        int n = arr.length;
        long total = 0;
        // Check each bit position (0–31)
        for (int i = 0; i < 32; i++) {
            long count1 = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) count1++;
            }
            long count0 = n - count1;
            total += count1 * count0 * (1L << i);
        }
        return total;
    }
}
