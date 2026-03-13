package HomePractice.GeeksForGeeks.Array.Basic;

import java.util.Scanner;

/*
Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.
Examples:
Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: true
Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: false
Exlpanation: Since, 3 is not present in the array, output is false.
Input: arr[] = [2, 3, 5, 6], k = 1
Output: false
 */
public class SortedArraySearch {
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
        System.out.print("Enter the search element : ");
        int search = sc.nextInt();
        if(searchInSorted(arr,search))
        {
            System.out.print("Element is found");
        }
        else {
            System.out.print("Element is not found");
        }
    }
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int ele: arr){
            if(ele == k){
                return true;
            }
        }
        return false;
    }
}
