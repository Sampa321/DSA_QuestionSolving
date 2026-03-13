package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
Given an array arr of integers. First sort the array then find whether three numbers are such that the sum of two elements equals the third element.

Example:
Input: arr[] = [1, 2, 3, 4, 5]
Output: true
Explanation: The pair (1, 2) sums to 3.
Input: arr[] = [3, 4, 5]
Output: false
Explanation: No triplets satisfy the condition.
 */
public class TripletFamily {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        if(findTriplet(arr))
        {
            System.out.print("element found");
        }
        else {
            System.out.print("Element not found");
        }
    }
    public static boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for(int value : arr)
        {
            set.add(value);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum = arr[i]+arr[j];
                if(set.contains(sum))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
