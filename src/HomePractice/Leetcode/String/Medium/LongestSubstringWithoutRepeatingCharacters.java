package HomePractice.Leetcode.String.Medium;

import java.util.HashSet;

/*3.
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String []args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int c = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            c = Math.max(c, i-left+1);
        }
        return c;
    }
}
