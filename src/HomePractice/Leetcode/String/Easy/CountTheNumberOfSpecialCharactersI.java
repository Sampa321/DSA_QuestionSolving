package HomePractice.Leetcode.String.Easy;

import java.util.HashSet;

/*3120
You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.



Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters in word are 'a', 'b', and 'c'.

Example 2:

Input: word = "abc"

Output: 0

Explanation:

No character in word appears in uppercase.

Example 3:

Input: word = "abBCab"

Output: 1

Explanation:

The only special character in word is 'b'.
 */
public class CountTheNumberOfSpecialCharactersI {
    public static void main(String[] args) {
        String word = "abBCab";
        System.out.println(numberOfSpecialChars(word));
    }
    public static int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : word.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            if(set.contains(ch) && set.contains((char)(ch - 'a' + 'A'))) {
                count++;
            }
        }

        return count;
    }
}
