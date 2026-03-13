package ClassPractice.ProblemSolving.Geeksforgeeks.Array.Medium;

import java.util.Scanner;

/*
Given an array of positive integers arr[] and a value sum, determine if there is a subset of arr[] with sum equal to given sum.

Examples:

Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
Output: true
Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9.
Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 30
Output: false
Explanation: There is no subset with target sum 30.
Input: arr[] = [1, 2, 3], sum = 6
Output: true
Explanation: The entire array can be taken as a subset, giving 1 + 2 + 3 = 6.
 */
public class SubsetSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of sum : ");
        int sum = sc.nextInt();
        System.out.println(isSubsetSum(arr,sum)?"Subset sum possible!":"Subset sum is not possible!!");
    }
    public static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return subset(arr,sum,0);
    }
    public static boolean subset(int arr[],int sum, int counter)
    {
        if(sum == 0)
        {
            return true;
        }
        if(counter == arr.length && sum != 0)
        {
            return false;
        }
        return subset(arr,sum-arr[counter],counter+1) || subset(arr,sum,counter+1);
    }
}
