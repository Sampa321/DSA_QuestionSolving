package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Geek is given a task to select at most 10 employees for a company project. Each employee is represented by a single-digit ID number which is unique for all the selected employees for the project. Geek has a technical problem in his system which printed ID number multiple times. You are given array arr having all printed IDs. Help him to get rid of the repeated IDs.

Examples:

Input: arr[] = [8, 8, 6, 2, 1]
Output: [8, 6, 2, 1]
Explanation: 8 is repeated, so takes 8 single time.
Input: arr[] = [7, 6, 7, 4, 2, 7]
Output: [7, 6, 4, 2]
Explanation: 7 and 6 are repeated, so take 7 and 6 single time.
 */
public class RepeatedIds {
    public static ArrayList<Integer> uniqueId(int[] arr) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:arr)
        {
            if(!list.contains(ele))
            {
                list.add(ele);
            }
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
        System.out.println("Array is :"+ Arrays.toString(arr));
        System.out.println("After uniqueId , arraylist is : "+uniqueId(arr));
    }
}
