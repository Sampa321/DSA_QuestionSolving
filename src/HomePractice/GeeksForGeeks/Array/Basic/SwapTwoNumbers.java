package HomePractice.GeeksForGeeks.Array.Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
You are given two numbers a and b. Your task is to swap the given two numbers.
Note: Try to do it without a temporary variable.
Examples:
Input: a = 13, b = 9
Output: 9 13
Explanation: After swapping it becomes 9 and 13.
Input: a = 15, b = 8
Output: 8 15
Explanation: after swapping it becomes 8 and 15.
 */
public class SwapTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int arr[] = new int[2];
        int idx = 0;
        for(int ele:get(a,b))
        {
            arr[idx++] = ele;
        }
        System.out.printf(Arrays.toString(arr));
    }
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> list = new ArrayList<>();
        int temp=a;
        a=b;
        b=temp;
        list.add(a);
        list.add(b);
        return list;
    }
}
