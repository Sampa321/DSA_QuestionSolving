package HomePractice.GeeksForGeeks.Array.Easy;
/*
You are given an array arr. Replace every element with the next greatest element (the greatest element on its right side) in the array. Note: There is no element next to the last element, so replace it with -1.
Example:
Input: arr[] = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 5, 5, 2, -1]
Explanation: For 16 the greatest element
on its right is 17. For 17 it's 5.
For 4 it's 5. For 3 it's 5. For 5 it's 2.
For 2 it's -1(no element to its right).
Input: arr[] = [2, 3, 1, 9]
Output: [9, 9, 9, -1]
Explanation: For each element except 9 the
greatest element on its right is 9.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreatestRightSide {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Greatest on right side:"+nextGreatest(arr));
    }
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length - 1;
        int j = 0;
        int max = arr[n];
        res.add(-1);

        for(int i = n; i > 0; i--)
            res.add(Math.max(arr[i], res.get(j++)));

        Collections.reverse(res);

        return res;
    }
}
