package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[] of integers, calculate the median.
Examples:
Input: arr[] = [90, 100, 78, 89, 67]
Output: 89
Explanation: After sorting the array middle element is the median
Input: arr[] = [56, 67, 30, 79]
Output: 61.5
Explanation: In case of even number of elements, average of two middle elements is the median.
Input: arr[] = [1, 2]
Output: 1.5
Explanation: The average of both elements will result in 1.5.
 */
public class MedianOfAnArray {
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
        System.out.printf("Median is : "+findMedian(arr));
    }
    public static double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2!= 0){
            return arr[n/2];
        }
        int fele=arr[(n/2)-1];
        int se=arr[n/2];
        return (double)(fele+se)/2;
    }
}
