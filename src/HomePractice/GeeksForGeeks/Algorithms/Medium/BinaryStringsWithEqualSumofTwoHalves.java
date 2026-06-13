package HomePractice.GeeksForGeeks.Algorithms.Medium;
/*
Given a number n, find count of all binary sequences of length 2n such that sum of first n bits is same as sum of last n bits.

Note: Since the anwer can be very large, so return the answer modulo 109+7.

Examples:

Input: n = 2
Output: 6
Explanation: There are 6 sequences of length 2*n, the sequences are 0101, 0110, 1010, 1001, 0000 and 1111.
Input: n = 1
Output: 2
Explanation: There are 2 sequence of length 2*n, the sequence are 00 and 11.
 */
public class BinaryStringsWithEqualSumofTwoHalves {
    static int mod = 1000000007;
    public static long inv(long r) {
        if (r == 1) return 1;
        return (mod - ((mod / r) * inv(mod % r)) % mod + mod) % mod;
    }

    public static int computeValue(int n) {
        long ans = 1, ncr = 1;
        for (int i = 1; i <= n; i++) {
            ncr = ((ncr * (n + 1 - i)) % mod * inv(i)) % mod;
            ans = (ans + (ncr * ncr) % mod) % mod;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(computeValue(2)); // 6
        System.out.println(computeValue(1)); // 2
    }
}
