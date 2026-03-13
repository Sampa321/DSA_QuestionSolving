package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
 */
public class FirstAndLastOccurrence {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the search element : ");
        int search = sc.nextInt();
        System.out.println("ArrayList is : "+ Arrays.toString(arr));
        System.out.println("First and second index is : "+find(arr,search));
    }
   public static ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = -1;
        int second = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                first = i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == x)
            {
                second = i;
                break;
            }
        }
        list.add(first);
        list.add(second);
        return list;
    }
}
