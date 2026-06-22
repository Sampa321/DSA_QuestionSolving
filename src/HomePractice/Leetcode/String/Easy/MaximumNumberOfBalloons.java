package HomePractice.Leetcode.String.Easy;
/*1189.
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.
Example 1:
Input: text = "nlaebolko"
Output: 1
Example 2:
Input: text = "loonbalxballpoon"
Output: 2
Example 3:
Input: text = "leetcode"
Output: 0
 */
public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for(char ch : text.toCharArray())
        {
            if(ch == 'b') b++;
            else if(ch == 'a') a++;
            else if(ch == 'l') l++;
            else if(ch == 'o') o++;
            else if(ch == 'n') n++;
        }
        return Math.min(Math.min(a, b),Math.min(Math.min(l/2,o/2),n));
    }
}
