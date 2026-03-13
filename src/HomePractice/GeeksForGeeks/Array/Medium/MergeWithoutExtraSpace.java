package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Scanner;

/*
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].
Input: a[] = [0, 1], b[] = [2, 3]
Output: a[] = [0, 1], b[] = [2, 3]
Explanation: After merging two sorted arrays we get [0, 1, 2, 3].
 */
public class MergeWithoutExtraSpace {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 1st array elements : ");
        int []arr1 = new int[n1];
        for(int i = 0;i<n1;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i]= sc.nextInt();
        }
        System.out.print("Enter the 2nd array size : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the 2nd array elements : ");
        int []arr2 = new int[n2];
        for(int i = 0;i<n2;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i]= sc.nextInt();
        }

        System.out.print("Before merge, 1st array is :");
        for(int i = 0;i<n1;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Before merge, 2nd array is :");
        for(int i = 0;i<n2;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        mergeArrays(arr1,arr2);
        System.out.print("After merge, 1st array is :");
        for(int i = 0;i<n1;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("After merge, 2nd array is :");
        for(int i = 0;i<n2;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    public static void mergeArrays(int a[], int b[]) {
        // code here
        int arr[] = new int[a.length+b.length];
        int idx=0;
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                arr[idx++] = a[i++];
            }
            else
            {
                arr[idx++] = b[j++];
            }
        }
        while(i<a.length)
        {
            arr[idx++] = a[i++];
        }
        while(j<b.length)
        {
            arr[idx++] = b[j++];
        }
        for(i=0;i<a.length;i++)
        {
            a[i] = arr[i];
        }
        int index=0;
        for(i=a.length;i<arr.length;i++)
        {
            b[index++] = arr[i];
        }
    }
}
