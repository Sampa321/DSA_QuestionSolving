package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given an array arr[] and positive integer k, count total number of pairs in the array whose sum is divisible by k.

Examples:

Input :  arr[] = [2, 2, 1, 7, 5, 3], k = 4
Output : 5
Explanation : There are five pairs possible whose sum is divisible by '4' i.e., (2, 2), (1, 7), (7, 5), (1, 3) and (5, 3).
Input : arr[] = [5, 9, 36, 74, 52, 31, 42], k = 3
Output : 7
Explanation : There are seven pairs whose sum is divisible by 3, i.e, (9, 36), (9,42), (74, 52), (36, 42), (74, 31), (31, 5) and (5, 52).
 */
public class CountPairsDivisibleByK {
   public static void main(String[] args) {
       int[] arr = {5, 9, 36, 74, 52, 31, 42};
       int k = 3;
       System.out.println(countKdivPairs(arr, k));
    }
    public static int countKdivPairs(int[] arr, int k) {
        // code here
        int count = 0;
        int []freq = new int[k];
        for(int i = 0; i < arr.length; i++)
        {
            int r = arr[i] % k;
            if(r < 0) count += k;
            int complement = (k - r) % k;
            count += freq[complement];
            freq[r]++;
        }
        return count;
    }
}
