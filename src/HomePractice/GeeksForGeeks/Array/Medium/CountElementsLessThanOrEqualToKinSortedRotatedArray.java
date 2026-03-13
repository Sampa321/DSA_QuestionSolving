package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a sorted array arr[] containing distinct positive integers that has been rotated at some unknown pivot, and a value x. Your task is to count the number of elements in the array that are less than or equal to x.

Examples:

Input: arr[] = [4, 5, 8, 1, 3], x = 6
Output: 4
Explanation: 1, 3, 4 and 5 are less than 6, so the count of all elements less than 6 is 4.
Input: arr[] = [6, 10, 12, 15, 2, 4, 5], x = 14
Output: 6
Explanation: All elements except 15 are less than 14, so the count of all elements less than 14 is 6.
 */
public class CountElementsLessThanOrEqualToKinSortedRotatedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("Array is : "+Arrays.toString(arr));
        System.out.println("Result is : "+countLessEqual(arr,k));
    }
    public static int countLessEqual(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        if(arr[0]>x)
        {
            return 0;
        }
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x)
            {
                return c;
            }
            else{
                c++;
            }
        }
        return c;
    }
}
