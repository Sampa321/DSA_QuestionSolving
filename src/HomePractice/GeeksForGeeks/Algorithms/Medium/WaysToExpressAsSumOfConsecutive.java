package HomePractice.GeeksForGeeks.Algorithms.Medium;
/*
Given a number n, find the number of ways to represent this number as a sum of 2 or more consecutive natural numbers.

Examples:

Input: n = 10
Output: 1
Explanation: There is only one way, 10 = 1+2+3+4.
Input: n = 15
Output: 3
Explanation: There are 3 ways, (15 = 1+2+3+4+5), (15 = 4+5+6) and (15 = 7+8).
 */
public class WaysToExpressAsSumOfConsecutive {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(getCount(n));
    }
    public static int getCount(int n) {
        // code here
        if(n < 3) return 0;
        int sum = 0;
        int c = 0;
        int left = 1;
        for(int i = 1; i <= (n/2)+1; i++)
        {
            sum += i;
            while(sum > n)
            {
                sum -= left;
                left++;
            }
            if(sum == n)
            {
                c++;
            }

        }
        return c;
    }
}
