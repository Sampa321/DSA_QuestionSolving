package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr of even size, sort the first half of the array in ascending order and the second half in descending order.

Examples :

Input: arr[] = [10, 20, 30, 40]
Output: [10, 20, 40, 30]
Explanation: The 10 and 20 will be sorted in ascending order and 30 and 40 will be sorted in descending order.
Input: arr[] = [5, 4, 6, 2, 3, 8, 9, 7]
Output: [2, 4, 5, 6, 9, 8, 7, 3]
Explanation: The 5, 4, 6, 2 will be sorted in ascending order and 3, 8, 9, 7 will be sorted in descending order.
 */
public class SortFirstHalfAscendingAndSecondHalfDescending {
    public static ArrayList<Integer> customSort(int[] arr) {
        // your code
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int arr1[] = new int[n/2];
        int arr2[] = new int[n/2];
        for(int i=0;i<n/2;i++)
        {
            arr1[i] = arr[i];
        }
        int idx = 0;
        for(int i=n/2;i<n;i++)
        {
            arr2[idx++] = arr[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int ele:arr1)
        {
            list.add(ele);
        }
        for(int i=(arr2.length)-1;i>=0;i--)
        {
            list.add(arr2[i]);
        }
        return list;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n =sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before custom sort, array list is : "+Arrays.toString(arr));
        System.out.println("After custom sort, array list is : "+customSort(arr));
    }
}
