package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Easy;
/*
A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it.

Examples:

Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
Input: arr[] = [3, 1, 2]
Output: 1
Explanation: Here 1 is the minimum element.
Input: arr[] = [4, 2, 3]
Output: 2
Explanation: Here 2 is the minimum element.
 */
public class SortedAndRotatedMinimum {
    //Efficient Approach
    public static int findMin(int[] arr) {
        // code here
        int min = Integer.MAX_VALUE;
        int l = 0;
        int h = arr.length-1;
        while(l <= h)
        {
            int mid = (l+h)/2;
            if(arr[l] <= arr[mid])
            {
                if(min > arr[l])
                {
                    min = arr[l];
                }
                l = mid+1;
            }
            else
            {
                if(arr[mid] < min)
                {
                    min = arr[mid];
                }
                h = mid-1;
            }
        }
        return min;
    }
   public static void main(String[] args) {
       int arr[] = {5, 6, 1, 2, 3, 4};
       System.out.println(findMin(arr));
    }
}
