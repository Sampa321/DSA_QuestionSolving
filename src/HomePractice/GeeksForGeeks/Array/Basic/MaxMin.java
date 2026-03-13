package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

Example 1:
Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
Example 2:
Input:
N = 4
A[]  = {1, 3, 4, 1}
Output: 5
Explanation: min = 1, max = 4. Sum = 1 + 4 = 5
 */
public class MaxMin {
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
        System.out.print("sum of max and min :"+findSum(arr,n));
    }
    public static int findSum(int A[], int N) {
        // code here
        Arrays.sort(A);
        int sum=0;
        sum=A[0]+A[A.length-1];
        return sum;
    }
}
