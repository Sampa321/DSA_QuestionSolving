package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given an array arr[] of positive integers and a value k. Return true if the sum of any non-empty subset of the given array is divisible by k otherwise, return false.

Examples:

Input: arr[] = [3, 1, 7, 5] , k = 6
Output: true
Explanation: If we take the subset {7, 5} then sum will be 12 which is divisible by 6.
Input: arr[] = [1, 2, 6] , k = 5
Output: false
Explanation: All possible subsets of the given set are {1}, {2}, {6}, {1, 2}, {2, 6}, {1, 6} and {1, 2, 6}. There is no subset whose sum is divisible by 5.
 */
public class CheckSubsetSumDivisibleByK {
    public static void main(String[] args) {
        int []arr = {3, 1, 7, 5};
        int k = 6;
        System.out.println(divisibleByK(arr, k));
    }
    public static boolean divisibleByK(int[] arr, int k) {
        // code here
        if(arr.length == 1)
        {
            if(arr[0] % k == 0)
            {
                return true;
            }
            return false;
        }
        int sum = 0;
        for(int ele : arr)
        {
            sum += ele;
        }
        if(sum < k){
            return false;
        }
        return subset(arr, 0, 0, k);
    }
    public static boolean subset(int []arr, int sum, int counter, int k)
    {
        if(sum % k == 0) return true;
        if(counter == arr.length) return false;
        return (subset(arr, sum + arr[counter], counter + 1, k)
                || subset(arr, sum, counter+1, k));
    }
}
