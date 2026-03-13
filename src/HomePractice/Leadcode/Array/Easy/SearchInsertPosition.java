package HomePractice.Leadcode.Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*35.
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                return i;
            }
        }
        return nums.length;
    }
   public static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array length: ");
        int n= sc.nextInt();
        int []arr = new int[n];
       System.out.println("Enter the array element : ");
       for(int i=0;i<n;i++) {
           arr[i] = sc.nextInt();
       }
       System.out.print("Enter the target element is : ");
       int target = sc.nextInt();
       System.out.println("Array is : "+ Arrays.toString(arr));
       System.out.println("search insert position is : "+searchInsert(arr,target));
    }
}
