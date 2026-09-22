package HomePractice.GeeksForGeeks.String.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a lowercase string s and a dictionary d[] containing lowercase words, find the longest word in the dictionary that can be obtained by deleting some characters from s without changing the order of the remaining characters.

Note: If multiple words have the same maximum length, return the lexicographically smallest one. If no valid word exists, return an empty string.

Examples :

Input: d = ["ale", "apple", "monkey", "plea"], s = "abpcplea"
Output: "apple"
Explanation: After deleting "b", "c", "a" s became "apple" which is present in d.
Input: d = ["a", "b", "c"], s = "abpcplea"
Output: "a"
Explanation: After deleting "b", "p", "c", "p", "l", "e", "a" s became "a" which is present in d.
 */
public class LongestMatchingInDictionaryWithRemovals {
    //Naive Approach
    public static String findLongestWord(String s, List<String> d) {
        // code here
        String res = "";
        for(String word : d)
        {
            if(subsequence(s, word))
            {
                if(word.length() > res.length())
                {
                    res = word;
                }
                else if(word.length() == res.length() && word.compareTo(res) < 0)
                {
                    res = word;
                }
            }
        }
        return res;
    }


    public static boolean subsequence(String s, String word)
    {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < word.length())
        {
            if(s.charAt(i) == word.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j == word.length();
    }


   public static void main(String[] args) {
       List<String> d = new ArrayList<>(Arrays.asList("ale", "apple", "monkey", "plea"));
         String s = "abpcplea";
         System.out.println(findLongestWord(s, d));
    }
}
