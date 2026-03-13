package HomePractice.GeeksForGeeks.String.Easy;

import java.util.HashSet;
import java.util.Scanner;

/*
Given a string s. Calculate the total number of unique substrings of the given string.

Examples:

Input: s = "abd"
Ouput: 6
Explanation: The 6 unique substrings are ["a", "b", "d", "ab", "bd", "abd"].
Input: s = "jaja"
Ouput: 7
Explanation:
The substrings will be ["j", "a", "j", "a", "ja", "aj", "ja", "jaj", "aja", "jaja"].
Out of these the unique are ["j", "a", "ja", "aj", "jaj", "aja", "jaja"].
 */
public class UniqueSubstring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("No of substring : "+unique_substring(str));
    }
    public static int unique_substring(String s) {
        // Your code here
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                set.add(s.substring(i,j+1));
            }
        }
        return set.size();
    }
}
