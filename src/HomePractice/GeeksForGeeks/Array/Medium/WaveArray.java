package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
Input: arr[] = [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.
Input: arr[] = [1]
Output: [1]
 */
public class WaveArray {
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
        System.out.println("Before wave, array is : "+ Arrays.toString(arr));
        sortInWave(arr);
        System.out.println("After wave, array is : "+ Arrays.toString(arr));
    }
    public static void sortInWave(int arr[]) {
        // code here
        if(arr.length%2==0)
        {
            for(int i=0;i<arr.length;i+=2)
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        else
        {
            for(int i=0;i<arr.length-1;i+=2)
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
