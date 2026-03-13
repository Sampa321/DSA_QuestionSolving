package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an increasing sequence arr, we need to find the K-th smallest missing element, taking the first element of the array as the starting point in the increasing sequence. If there is no k-th missing element then output -1.

Example:

Input: arr[] = [1, 3, 4, 5, 7] and k = 2
Output: 6
Explanation: k = 2, Missing numbers are 2 and 6. So 2nd missing number is 6.
Input: arr[] = [2, 3, 4, 5, 6, 8] and k = 1
Output: 7
Explanation: k = 1, the first missing number in the array is 7.
 */
public class KthMissingElementFound {
    public static int KthMissingElement(int arr[], int k) {
        // Complete the function
        int diff=arr[arr.length-1]-arr[0];
        if(k>diff)
        {
            return -1;
        }
        int i=0;
        int fst = arr[0];
        int mis=0;
        while(i<arr.length)
        {
            if(arr[i]==fst)
            {
                i++;
            }
            else{
                mis++;
            }
            if(mis == k)
            {
                return fst;
            }
            fst++;
        }
        return -1;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n =sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("Array is :"+ Arrays.toString(arr));
        if (KthMissingElement(arr,k)==-1)
        {
            System.out.println("kth element is not found!");
        }
        else {
            System.out.println("Kth missing element is :"+KthMissingElement(arr,k));
        }
    }
}
