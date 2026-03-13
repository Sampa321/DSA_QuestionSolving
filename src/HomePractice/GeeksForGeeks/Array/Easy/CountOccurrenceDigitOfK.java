package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[]. Your task is to return an integer denoting the total number of times digit k appears in the array.

Examples:

Input: k=1, arr[] = [11, 12, 13, 14, 15]
Output: 6
Explanation: Here, digit 1 appears in the whole array 6 times.
Input: k=3, arr[] = [11, 121, 15]
Output: 0
Explanation: Here, digit 3 appears in the whole array 0 times.
 */
public class CountOccurrenceDigitOfK {
    public static int num(int k, int arr[]) {
        // code here
        int c=0;
        for(int ele:arr)
        {
            while(ele>0)
            {
                int r = ele%10;
                if(r == k)
                {
                    c++;
                }
                ele/=10;
            }
        }
        return c;
    }
   public static void main(String [] args) {
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
       System.out.println("Count of k digit is : "+num(k,arr));
    }
}
