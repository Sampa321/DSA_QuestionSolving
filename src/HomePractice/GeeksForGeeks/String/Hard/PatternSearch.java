package HomePractice.GeeksForGeeks.String.Hard;

import java.util.Scanner;
/*
Given a string S and a pattern P consisting of lowercase characters. The task is to check if pattern P exists in the given string S or not.

Example 1:
Input:
S = abceabcdabceabcd
P = abcd
Output: Yes
Explanation: Given pattern abcd is present at index 4.
Example 2:
Input:
S = abceabcdabceabcd
P = gfhij
Output: No
Explanation: Given pattern gfhij is not found in the string.
*/
public class PatternSearch {
   public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string : ");
        String str = sc.next();
        System.out.print("Enter the search string : ");
        String search = sc.next();
        if(search(search,str))
        {
            System.out.print("Sub String is found");
        }
        else {
            System.out.print("Sub string is not found");
        }
    }
    static boolean search(String pat, String txt) {
        // Your code here
        int index=txt.indexOf(pat);
        if(index==-1)
        {
            return false;
        }
        return true;
    }
}
