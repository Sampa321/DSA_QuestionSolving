package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;
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
    // naive Approach
//    public static int kthMissing(int[] arr, int k) {
//        // code here
//        for(int ele : arr)
//        {
//            if(ele <= k) k++;
//            else break;
//        }
//        return k;
//    }


//    public static int kthMissing(int[] arr, int k) {
//        // code here
//        int n = arr.length;
//        for(int i = 0; i < arr.length; i++)
//        {
//            int missingNumber = arr[i] - (i+1);
//            if(missingNumber >= k) return k+i;
//        }
//        return k + n;
//    }


    //Efficient Approach
    public static int kthMissing(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        int missingNumber = 0;
        while(low < high)
        {
            int mid = (low + high)/2;
            missingNumber = arr[mid] - mid -1;
            if(missingNumber < k)
            {
                low = mid;

            }
            else if(missingNumber > k)
            {
                if(low + 1 == high)
                {
                    return arr[high] - (missingNumber-high) -1;
                }
                high = mid;
            }
            else {
                return arr[high]-1;
            }
        }
        return arr.length+k;
    }

   public static void main(String[] args) {
        int []arr = {2, 3, 4, 7, 11};
        int k = 5;
       System.out.println(kthMissing(arr, k));
    }
}
