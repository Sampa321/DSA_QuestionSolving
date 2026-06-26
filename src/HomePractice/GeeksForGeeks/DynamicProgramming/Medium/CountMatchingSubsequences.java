package HomePractice.GeeksForGeeks.DynamicProgramming.Medium;
/*
Given two strings, s1 and s2, count the number of subsequences of string s1 equal to string s2.

Return the total count modulo 1e9+7.

Examples :

Input: s1 = "geeksforgeeks", s2 = "gks"
Output: 4
Explanation: We can pick characters from s1 as a subsequence from indices [0, 3, 4], [0, 3, 12], [0, 11, 12] and [8, 11, 12]. So total 4 subsequences of s1 that are equal to s2.
Input: s1 = "problemoftheday", s2 = "geek"
Output: 0
Explanation: No subsequence of string s1 is equal to string s2.
 */
public class CountMatchingSubsequences {
    static final int MOD = 1000000007;
    public static void main(String []args) {
        String s1 = "geeksforgeeks";
        String s2 = "gks";
        System.out.println(countWays(s1, s2));
    }
    public static int countWays(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();

        long[] dp = new long[m + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 1; j--) {
                if (s1.charAt(i) == s2.charAt(j - 1)) {
                    dp[j] = (dp[j] + dp[j - 1]) % MOD;
                }
            }
        }
        return (int) dp[m];
    }
}
