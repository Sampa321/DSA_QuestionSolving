package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.Scanner;

/*
Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Examples :

Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
Input: a[] = [1, 4, 8, 10, 12], b[] = [5, 7, 11, 15, 17], k = 6
Output: 10
Explanation: Combined sorted array is [1, 4, 5, 7, 8, 10, 11, 12, 15, 17]. The 6th element of this array is 10.
 */
public class KthElementOfTwoSorted {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in arr1:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the array1 elements : ");
        for(int i=0;i<n1;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of element in arr2:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the array2 elements : ");
        for(int i=0;i<n2;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.print("After two array merge and sorted, your "+k+" th element is : "+kthElement(arr1,arr2,k));
    }
    public static int kthElement(int a[], int b[], int k) {
        // code here
        int []newArr = new int[a.length+b.length];
        int idx = 0;
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                newArr[idx++]=a[i++];
            }
            else
            {
                newArr[idx++] = b[j++];
            }
        }
        while(i<a.length)
        {
            newArr[idx++]=a[i++];
        }
        while(j<b.length)
        {
            newArr[idx++] = b[j++];
        }
        return newArr[k-1];
    }
}
