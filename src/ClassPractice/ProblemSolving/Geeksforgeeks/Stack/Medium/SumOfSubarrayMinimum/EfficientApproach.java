package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Medium.SumOfSubarrayMinimum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
Given an array arr[] of positive integers, find the total sum of the minimum elements of every possible subarrays.

Note: It is guaranteed that the total sum will fit within a 32-bit unsigned integer.

Examples:

Input: arr[] = [10, 20]
Output: 40
Explanation: Subarrays are [10], [20], [10, 20]. Minimums are 10, 20, 10.
Sum of all these is 40.
Input: arr[] = [1, 2, 3, 4]
Output: 20
Explanation: Subarrays are [1], [2], [3], [4], [1, 2], [1, 2, 3], [1, 2, 3, 4], [2, 3], [2, 3, 4], [3, 4]. Minimums are 1, 2, 3, 4, 1, 1, 1, 2, 2, 3.
Sum of all these is 20.
 */
public class EfficientApproach {
    public static void main(String[] args) {
        int []arr = {1,5, 7, 6, 2, 8, 5};
        System.out.println(sumSubMins(arr));
    }
    public static int sumSubMins(int []arr) {
        // code here
        ArrayList<Integer> nextSmaller = new ArrayList<>();
        ArrayList<Integer> previousSmaller = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();
        //find next smaller arrayList
        for(int i = arr.length-1; i >= 0; i--)
        {
            while (!st1.isEmpty() && arr[i] <= arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? arr.length : st1.peek();
            nextSmaller.add(store);
            st1.push(i);
        }
        Collections.reverse(nextSmaller);
        st1.clear();
        //find previous smaller arrayList
        for(int i = 0;i < arr.length; i++)
        {
            while (!st1.isEmpty() && arr[i] < arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? -1 : st1.peek();
            previousSmaller.add(store);
            st1.push(i);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int diff = (i- previousSmaller.get(i)) * (nextSmaller.get(i)-i);
            sum += diff*arr[i];
        }
        return sum;
    }
}
