package HomePractice.Leetcode.String.Medium;

import java.util.Stack;

/* 316.
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
Example 1:
Input: s = "bcabc"
Output: "abc"
Example 2:
Input: s = "cbacdcbc"
Output: "acdb"

 */
public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        int []count = new int[26];
        for(char ch : s.toCharArray())
        {
            count[ch-'a']++;
        }
        Stack<Character> st = new Stack<>();
        boolean []seen = new boolean[26];
        for(char ch : s.toCharArray())
        {
            count[ch-'a']--;
            if(seen[ch-'a'])  continue;
            while(!st.isEmpty() && st.peek() > ch && count[st.peek()-'a'] > 0)
            {
                char removed = st.pop();
                seen[removed-'a'] = false;
            }
            st.push(ch);
            seen[ch-'a'] = true;
        }

        StringBuilder re = new StringBuilder();
        for(char c : st)
        {
            re.append(c);
        }
        return re.toString();
    }
   public static void main(String[] args) {
       System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
}
