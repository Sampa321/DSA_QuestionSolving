package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
Given an integer array arr[ ], your task is to find the minimum number of increment operations required to make all the array elements unique. i.e. no value in the array should occur more than once. In one operation, a value can be incremented by 1 only.

Note: The answer will always fit into a 32-bit integer.

Examples :

Input: arr[] = [3, 2, 1, 2, 1, 7]
Output: 6
Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7]. It can be shown that it is impossible for the array to have all unique values with 5 or less operations.
Input: arr[] = [1, 2, 2]
Output: 1
Explanation: After one operation [2 -> 3], the array could be [1, 2, 3].
Input: arr[] = [5, 4, 3, 2, 1]
Output: 0
Explanation: All elements are unique.
 */
public class MakeArrayElementUnique {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is  : "+Arrays.toString(arr));
        System.out.println("Minimum increment is : "+minIncrements(arr));
    }
    public static int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int sum = 0;
        int max = 0;
        HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            max =Math.max(arr[i],max);
            if(!hs.contains(arr[i]))
            {
                hs.add(arr[i]);
            }
            else{
                sum+=max+1-arr[i];
                max++;
                hs.add(max);
            }
        }
        return sum;
    }
}
