package HomePractice.GeeksForGeeks.String.Medium;
/*
Given a binary string s consisting of 0s and 1s. Find the maximum difference of the number of 0s and the number of 1s (number of 0s – number of 1s) in a substring of the string.

Note: In the case of all 1s, the answer will be -1.

Examples:

Input : s = "11000010001"
Output : 6
Explanatio: From index 2 to index 9, there are 7 0s and 1 1s, so number of 0s - number of 1s is 6.
Input: s = "111111"
Output: -1
Explanation: s contains 1s only
 */
public class SubstringWithMaxZeroOneDiff {
    public static void main(String[] args) {
        String s = "11000010001";
        System.out.println(maxSubstring(s));
    }
    // code here
   public static int maxSubstring(String s) {
        int sum = 0;
        int maxSum = 0;
        boolean zero = false;
            for(int  i = 0; i < s.length(); i++)
        {
            int ch = s.charAt(i)-'0';
            if(ch == 1)
            {
                sum -=1;
            }
            else
            {
                sum += 1;
                zero = true;
            }
            if(sum < 0)sum = 0;
            if(maxSum < sum) maxSum = sum;
        }
            if(!zero)
        {
            return -1;
        }
            return maxSum;
    }
}
