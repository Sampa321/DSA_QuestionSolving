package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Given a 2D array arr[][], where arr[i][0] is the starting time of ith meeting and arr[i][1] is the ending time of ith meeting, the task is to check if it is possible for a person to attend all the meetings such that he can attend only one meeting at a particular time.

Note: A person can attend a meeting if its starting time is greater than or equal to the previous meeting's ending time.

Examples:

Input: arr[][] = [[1, 4], [10, 15], [7, 10]]
Output: true
Explanation: Since all the meetings are held at different times, it is possible to attend all the meetings.
Input: arr[][] = [[2, 4], [9, 12], [6, 10]]
Output: false
Explanation: Since the second and third meeting overlap, a person cannot attend all the meetings.
 */
public class MeetingRooms {
    public static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr, Comparator.comparingInt(a ->a[0]));
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i][1]>arr[i+1][0])
            {
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array row and column: ");
       int r =sc.nextInt();
       int c= sc.nextInt();
       int [][]arr = new int[r][c];
       System.out.println("Enter the array elements : ");
       for(int i=0;i<r;i++)
       {
            for(int j=0;j<c;j++)
            {
                System.out.print("arr["+i+"]["+j+"]=");
                arr[i][j] = sc.nextInt();
            }
       }
       System.out.println("Array is : ");
       for(int i =0 ;i<r;i++)
       {
           for (int j=0;j<c;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
       }
       System.out.println();
       if(canAttend(arr))
       {
           System.out.println("You can attend");
       }
       else {
           System.out.println("You cannot attend");
       }
    }
}
