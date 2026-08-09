package HomePractice.GeeksForGeeks.Array.Easy;
/*
Given an array arr[] consisting of only 0’s and 1’s, return count of the maximum number of consecutive 1’s or 0’s present in the array.

Examples:

Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.
Input: arr[] = [0, 0, 1, 0, 1, 0]
Output: 2
Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.
Input: arr[] = [0, 0, 0, 0]
Output: 4
Explanation: The maximum number of consecutive 0’s in the array is 4.
 */
public class MaxConsecutiveBit {
    public static int maxConsecBits(int[] arr) {
        // code here
        int maxOne = 0;
        int maxZero = 0;
        int currZero = 0;
        int currOne = 0;
        for(int ele : arr)
        {
            if(ele == 0)
            {
                currZero++;
                maxZero = Math.max(currZero, maxZero);
                currOne = 0;
            }
            else
            {
                currOne++;
                maxOne = Math.max(currOne, maxOne);
                currZero = 0;
            }
        }
        return Math.max(maxZero, maxOne);
    }
   public static void main(String[] args) {
        int []arr = {0, 1, 0, 1, 1, 1, 1};
       System.out.println(maxConsecBits(arr));
    }
}
