package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given a positive integer n, count all possible distinct binary strings of length n such that there are no consecutive 1’s.
Examples :
Input: n = 3
Output: 5
Explanation: 5 strings are ("000", "001", "010", "100", "101").
Input: n = 2
Output: 3
Explanation: 3 strings are ("00", "01", "10").
Input: n = 1
Output: 2
 */
public class Consecutive1sNotAllowed {
    public static void main(String[] args) {
        System.out.println(countStrings(3));
    }
    public static int countStrings(int n) {
        // code here
        if(n == 1) return 2;
        if(n == 2) return 3;
        int a = 2;
        int b = 3;
        int count = 0;
        for(int i = 3; i <= n; i++)
        {
            count = a + b;
            a = b;
            b = count;
        }
        return b;
    }
}
