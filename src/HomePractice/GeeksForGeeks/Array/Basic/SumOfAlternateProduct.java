package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr of even size consisting of positive integers. After sorting the array, find the sum of the product of i-th element from starting and i-th element from last.

Examples:
Input: arr[] = [9, 2, 8, 4, 5, 7, 6, 0]
Output: 74
Explanation: Required sum can be obtained as 9*0 + 8*2 + 7*4 + 6*5 which is equal to 74.
Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: array is already sorted 1*4 + 2*3 = 10
 */
public class SumOfAlternateProduct {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int []arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]= sc.nextInt();
        }
        System.out.println("Result is : "+altProduct(arr));
    }
    public static int altProduct(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int result=0;
        while(i<j)
        {
            result+=(arr[i]*arr[j]);
            i++;
            j--;
        }
        return result;
    }
}
