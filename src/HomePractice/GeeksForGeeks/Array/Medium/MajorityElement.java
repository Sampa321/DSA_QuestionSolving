package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.*;

/*
Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.

Note: The returned array of majority elements should be sorted.

Examples:

Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
Output: [1, 2]
Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
Input:  arr[] = [-5, 3, -5]
Output: [-5]
Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).
Input:  arr[] = [3, 2, 2, 4, 1, 4]
Output: []
Explanation: There is no majority element.
 */
public class MajorityElement {
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
        System.out.println("Array is  : "+Arrays.toString(arr));
        System.out.println("Majority element is : "+findMajority(arr));
    }
    public static ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int onethird = arr.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for(Map.Entry<Integer ,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>onethird)
            {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}
