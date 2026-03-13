package HomePractice.GeeksForGeeks.Array.Hard;

import java.util.Scanner;

/*
Given two sorted arrays a[] and b[], find and return the median of the combined array after merging them into a single sorted array.

Examples:


Input: a[] = [3, 5, 6, 12, 15], b[] = [3, 4, 6, 10, 10, 12]
Output: 6
Explanation: The merged array is [3, 3, 4, 5, 6, 6, 10, 10, 12, 12, 15]. So the median of the merged array is 6.
Input: a[] = [2, 3, 5, 8], b[] = [10, 12, 14, 16, 18, 20]
Output: 11
Explanation: The merged array is [2, 3, 5, 8, 10, 12, 14, 16, 18, 20]. So the median of the merged array is (10 + 12) / 2 = 11.
Input: a[] = [], b[] = [2, 4, 5, 6]
Output: 4.5
Explanation: The merged array is [2, 4, 5, 6]. So the median of the merged array is (4 + 5) / 2 = 4.5.
 */
public class MedianOf2SortedArraysOfDifferentSize {
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
        System.out.println("Median is : "+medianOf2(arr1,arr2));
    }
    public static double medianOf2(int a[], int b[]) {
        // Code Here
        int []arr = new int[a.length+b.length];
        int i = 0,j = 0;
        int idx = 0;
        while(i<a.length && j<b.length)
        {
            if(a[i] <= b[j])
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
        if(arr.length%2 !=0)
        {
            return arr[arr.length/2];
        }
        double r =  (double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        return r;
    }
}
