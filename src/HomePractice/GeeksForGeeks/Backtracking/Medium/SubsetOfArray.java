package HomePractice.GeeksForGeeks.Backtracking.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[] of distinct positive integers, your task is to find all its subsets.

Note: You can return the subsets in any order, the driver code will print them in sorted order.

Examples:

Input: arr[] = [1, 2, 3]
Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
Explanation:
The subsets of [1, 2, 3] in lexicographical order are:
[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]
Input: arr[] = [2, 4]
Output: [[], [2], [2, 4], [4]]
Explanation:
The subsets of [2, 4] in lexicographical order are:
[], [2], [2, 4], [4]
 */
public class SubsetOfArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array element is : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("subset are : ");
        System.out.println(subsets(arr));
    }
    public static ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> dummy = new ArrayList<>();
        subset(result,arr,dummy,0);
        return result;
    }
    public static void subset(ArrayList<ArrayList<Integer>> result,int []arr,ArrayList<Integer> list,int c)
    {
        result.add(new ArrayList<>(list));
        for(int i = c;i<arr.length;i++)
        {
            list.add(arr[i]);
            subset(result,arr,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
