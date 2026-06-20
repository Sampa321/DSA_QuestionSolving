package HomePractice.Leetcode.String.Medium;
/*   678.
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "(*)"
Output: true
Example 3:

Input: s = "(*))"
Output: true
 */
public class ValidParenthesisString {
    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                leftMin++;
                leftMax++;
            }
            else if(ch == ')')
            {
                leftMin--;
                leftMax--;
            }
            else
            {
                leftMin--;
                leftMax++;
            }
            if(leftMax < 0) return false;
            if(leftMin < 0) leftMin = 0;
        }
        return leftMin == 0;
    }
}
