package HomePractice.GeeksForGeeks.Array.Medium;
/*
Given a rope of length n meters, cut it into multiple smaller ropes such that the product of their lengths is maximized. At least one cut is mandatory.

Examples:

Input: n = 2
Output: 1
Explanation: Since 1 cut is mandatory. Maximum obtainable product is 1 * 1 = 1.
Input: n = 5
Output: 6
Explanation: Maximum obtainable product is 2 * 3 = 6.
 */
public class CutRopeToMaximiseProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(5));
    }
    public static int maxProduct(int n) {
        // code here
        if(n == 2) return 1;
        if(n == 3) return 2;
        int product = 1;
        while(n > 4)
        {
            product *= 3;
            n -= 3;
        }
        return product*n;
    }
}
