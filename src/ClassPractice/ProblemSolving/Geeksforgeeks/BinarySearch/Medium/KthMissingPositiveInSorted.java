package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Medium;
/*
Given a sorted array of distinct positive integers arr[] and a number k, You need to find the kth positive number that is missing from the arr[].

Examples:

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
Input: arr[] = [1, 2, 3], k = 2
Output: 5
Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.
Input: arr[] = [3, 5, 9, 10, 11, 12], k = 2
Output: 2
Explanation: Missing are 1, 2, 4, 6… and 2nd missing number is 2.
 */
public class KthMissingPositiveInSorted {
    // Naive Approach
//    public int kthMissing(int[] arr, int k) {
//        // code here
//        for(int ele : arr)
//        {
//            if(ele <= k) k++;
//            else break;
//        }
//        return k;
//    }

    //Efficient Approach
    public static int kthMissing(int[] arr, int k) {
        // code here
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int missingValue = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            missingValue = arr[mid] - (mid+1);
            if(k <= missingValue)
            {
                high = mid - 1;
            }else
            {
                low = mid + 1;
            }
        }
        return 1+high+k;
    }
   public static void main(String[] args) {
       int []arr = {2, 3, 4, 7, 11};
       int k = 5;
       System.out.println(kthMissing(arr, k));
    }
}
