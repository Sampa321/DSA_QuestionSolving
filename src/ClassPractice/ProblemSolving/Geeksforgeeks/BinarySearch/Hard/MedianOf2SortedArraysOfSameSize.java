package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearch.Hard;

import java.util.ArrayList;
import java.util.Collections;

/*
Given two sorted arrays a[] and b[] of equal size, find and return the median of the combined array after merging them into a single sorted array.

Examples:

Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4]
Output: 0
Explanation: The merged array is [-12, -10, -6, -5, -3, 3, 4, 6, 12, 15]. So the median of the merged array is (-3 + 3) / 2 = 0.
Input: a[] = [2, 3, 5, 7], b[] = [10, 12, 14, 16]
Output: 8.5
Explanation: The merged array is [2, 3, 5, 7, 10, 12, 14, 16]. So the median of the merged array is (7 + 10) / 2 = 8.5.
Input: a[] = [-5], b[] = [-6]
Output: -5.5
Explanation: The merged array is [-6, -5]. So the median of the merged array is (-6 + -5) / 2 = -5.5.
 */
public class MedianOf2SortedArraysOfSameSize {

    //Merge sort
//    public static double medianOf2(int a[], int b[]) {
//        // Code Here
//        ArrayList<Integer> list = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        while(i < a.length && j < b.length)
//        {
//            if(a[i] <= b[j])
//            {
//                list.add((a[i]));
//                i++;
//            }
//            else {
//                list.add(b[j++]);
//            }
//        }
//
//        while (i < a.length)
//        {
//            list.add((a[i]));
//            i++;
//        }
//
//        while (j < b.length)
//        {
//            list.add(b[j++]);
//        }
//
//
//        int n = list.size()/2;
//        double re = (double)(list.get(n-1)+list.get(n))/2;
//        return re;
//    }


    //Better Approach
//    public static double medianOf2(int a[], int b[]) {
//        // Code Here
//        int i = 0, j = 0, temp = 0;
//        int n = a.length;
//        int m = b.length;
//        int median = (n+m)/2;
//        int count = -1, first = 0, sec = 0;
//        while(i < n && j < m){
//            if(a[i] <= b[j])
//            {
//                temp = a[i];
//                i++;
//                count++;
//            }
//            else
//            {
//                temp = b[j];
//                j++;
//                count++;
//            }
//            if(count == (median -1))
//            {
//                first = temp;
//            }
//            if(count == median)
//            {
//                sec = temp;
//            }
//        }
//
//
//        while(i < n && count < median)
//        {
//            temp = a[i];
//            i++;
//            count++;
//            if(count == ((n+m)/2) -1)
//            {
//                first = temp;
//            }
//            if(count == (n+m)/2)
//            {
//                sec = temp;
//            }
//        }
//
//
//        while(j < m && count < median)
//        {
//            temp = b[j];
//            j++;
//            count++;
//            if(count == ((n+m)/2) -1)
//            {
//                first = temp;
//            }
//            if(count == (n+m)/2)
//            {
//                sec = temp;
//                break;
//            }
//        }
//        return sec;
//    }



    // Efficient Approach
    public static double medianOf2(int a[], int b[]) {
        int n = a.length, m = b.length;

        if (n > m) {
            return medianOf2(b, a);
        }

        int left = (n + m + 1) / 2;
        int low = 0, high = n;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];

            int r1 = (mid1 == n) ? Integer.MAX_VALUE : a[mid1];
            int r2 = (mid2 == m) ? Integer.MAX_VALUE : b[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return ((double) Math.max(l1, l2)
                        + Math.min(r1, r2)) / 2.0;
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return 0.0;
    }



   public static void main(String[] args) {
        int []a = {2, 3, 5, 7};
        int []b = {10, 12, 14, 16};
       System.out.println(medianOf2(a,b));
     }
}
