package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
In a given array arr[], find the maximum value of (arr[i] – i) - (arr[j] – j) where i is not equal to j and n is the size of the array. i and j vary from 0 to n-1  arr[].

Examples:

Input: arr[] = [9, 15, 4, 12, 13]
Output: 12
Explanation: (a[1]-1) - (a[2]-2) = (15-1)-(4-2) = 12
Input: arr[] = [3, 1, 2, 4]
Output: 3
Explanation: (a[0]-0) -(a[1]-1) = (3-0) - (1-1) = 3
 */
public class MaxValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arraylist size : ");
        int n = sc.nextInt();
        System.out.println("Enter the arraylist elements : ");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            int ele = sc.nextInt();
            list.add(ele);
        }
        System.out.println("ArrayList is : "+list);
        System.out.println("Result is : "+maxVal(list));
    }
    public static int maxVal(List<Integer> arr) {
        // code here
        int []array = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            array[i] = arr.get(i)-i;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++)
        {
            max = Math.max(array[i],max);
            min = Math.min(array[i],min);
        }
        return max-min;
    }
}
