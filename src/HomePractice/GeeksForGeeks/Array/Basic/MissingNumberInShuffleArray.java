package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr1. The contents of arr are copied into another array arr2 and numbers are shuffled. Also, one element is removed from arr2. The task is to find the missing element.

Examples:
Input: arr1[] = [4, 8, 1, 3, 7] and arr2[] = [7, 4, 3, 1]
Output: 8
Explanation: 8 is the only element missing from arr2.
Input: arr1[] = [12, 10, 15, 23, 11, 30] and arr2[] = [15, 12, 23, 11, 30]
Output: 10
Explanation: 10 is the only element missing from arr2.
 */
public class MissingNumberInShuffleArray {
    public static int findMissing(int[] arr1, int[] arr2) {
        // code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length-1;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return arr1[i];
            }
        }
        return arr1[arr1.length-1];
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array1 length : ");
        int n1 =sc.nextInt();
        int []arr1 = new int[n1];
        System.out.println("Enter the array1 elements : ");
        for(int i=0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int n2 =n1-1;
        int []arr2 = new int[n2];
        System.out.println("Enter the array2 elements : ");
        for(int i=0;i<n2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array1 is : "+Arrays.toString(arr1));
        System.out.println("Array2 is : "+Arrays.toString(arr2));
        System.out.println("Missing number in shuffle array is : "+findMissing(arr1,arr2));
    }

}
