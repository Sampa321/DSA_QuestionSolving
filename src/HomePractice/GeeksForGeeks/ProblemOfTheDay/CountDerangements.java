package HomePractice.GeeksForGeeks.ProblemOfTheDay;

import java.util.Scanner;

/*
Given a number n, find the total number of Derangements of elements from 1 to n. A Derangement is a permutation of n elements, such that no element appears in its original position, i.e., 1 should not be the first element, 2 should not be second, etc. For example, [5, 3, 2, 1, 4] is a Derangement of first 5 elements.

Note: The answer will always fit into a 32-bit integer.

Examples:

Input: n = 2
Output: 1
Explanation: For [1, 2], there is only one possible derangement: [2, 1].
Input: n = 3
Output: 2
Explanation: For the set [1, 2, 3], there are only two possible derangements: [2, 3, 1] and [3, 1, 2].
 */
public class CountDerangements {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n : ");
       int n = sc.nextInt();
       System.out.println("Result is  : "+derangeCount(n));
    }
    public static int derangeCount(int n) {
        // code here
        if(n == 1) return 0;
        if(n == 2) return 1;
        int f = 0;
        int s = 1;
        for(int i = 3;i <= n ; i++)
        {
            int curr = (i-1)*(f+s);
            f = s;
            s = curr;
        }
        return s;
    }
}
