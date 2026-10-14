package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Medium;
/*
Given an array arr[] of distinct elements, which was initially sorted in ascending order but then rotated at some unknown pivot, the task is to find the index of a target key.  If the key is not present in the array, return -1.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
 */
public class SearchInRotatedSortedArray {

    // Efficient Approach (T.C = O(logn)
   public static int search(int[] arr, int key) {
        // code here
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[low] <= arr[mid])
            {
                if(arr[low] <= key && key < arr[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }

            }
            else
            {
                if(arr[mid] < key && key <= arr[high])
                {

                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
   public static void main(String[] args) {
        int []arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
       System.out.println(search(arr, key));
    }
}
